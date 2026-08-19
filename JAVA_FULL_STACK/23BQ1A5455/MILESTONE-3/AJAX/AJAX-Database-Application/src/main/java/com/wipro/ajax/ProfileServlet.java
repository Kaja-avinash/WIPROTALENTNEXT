package com.wipro.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/ajaxdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Avinash@123";

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");

        if (email == null || email.trim().isEmpty()) {
            out.print("{\"error\":\"Email is required\"}");
            return;
        }

        email = email.trim();

        String sql = "SELECT EMAIL, PASSWORD, NAME, DATEOFBIRTH, "
                   + "GENDER, CITY, PINCODE, MOBILE "
                   + "FROM Profile "
                   + "WHERE LOWER(EMAIL) = LOWER(?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(
                        DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, email);

                try (ResultSet rs = ps.executeQuery()) {

                    if (rs.next()) {

                        out.print("{");
                        out.print("\"available\":false,");
                        out.print("\"email\":\"" + escapeJson(rs.getString("EMAIL")) + "\",");
                        out.print("\"password\":\"" + escapeJson(rs.getString("PASSWORD")) + "\",");
                        out.print("\"name\":\"" + escapeJson(rs.getString("NAME")) + "\",");
                        out.print("\"dateOfBirth\":\"" + escapeJson(rs.getString("DATEOFBIRTH")) + "\",");
                        out.print("\"gender\":\"" + escapeJson(rs.getString("GENDER")) + "\",");
                        out.print("\"city\":\"" + escapeJson(rs.getString("CITY")) + "\",");
                        out.print("\"pincode\":\"" + escapeJson(rs.getString("PINCODE")) + "\",");
                        out.print("\"mobile\":\"" + escapeJson(rs.getString("MOBILE")) + "\"");
                        out.print("}");

                    } else {

                        out.print("{");
                        out.print("\"available\":true,");
                        out.print("\"email\":\"" + escapeJson(email) + "\"");
                        out.print("}");
                    }
                }
            }

        } catch (Exception e) {

            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);

            out.print("{");
            out.print("\"error\":\"Database error: "
                    + escapeJson(e.getMessage()) + "\"");
            out.print("}");
        }
    }

    private String escapeJson(String value) {

        if (value == null) {
            return "";
        }

        return value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\r", "\\r")
                .replace("\n", "\\n");
    }
}