package com.wipro.library;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/librarydb?useSSL=false&serverTimezone=UTC";

    private static final String DB_USER = "root";

    private static final String DB_PASSWORD = "Avinash@123";

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (email == null || email.trim().isEmpty()
                || password == null || password.trim().isEmpty()) {

            out.print(
                "{\"success\":false,\"message\":\"Invalid Credentials\"}"
            );
            return;
        }

        String sql =
                "SELECT NAME FROM XYZ_PROFILE " +
                "WHERE LOWER(EMAIL) = LOWER(?) AND PASSWORD = ?";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (
                Connection connection =
                        DriverManager.getConnection(
                                DB_URL,
                                DB_USER,
                                DB_PASSWORD
                        );

                PreparedStatement statement =
                        connection.prepareStatement(sql)
            ) {

                statement.setString(1, email.trim());
                statement.setString(2, password);

                try (ResultSet resultSet = statement.executeQuery()) {

                    if (resultSet.next()) {

                        String name = resultSet.getString("NAME");

                        out.print(
                            "{\"success\":true," +
                            "\"message\":\"Login successful\"," +
                            "\"name\":\"" +
                            escapeJson(name) +
                            "\"}"
                        );

                    } else {

                        out.print(
                            "{\"success\":false," +
                            "\"message\":\"Invalid Credentials\"}"
                        );
                    }
                }
            }

        } catch (Exception e) {

            response.setStatus(
                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR
            );

            out.print(
                "{\"success\":false," +
                "\"message\":\"Database error occurred.\"}"
            );

            e.printStackTrace();
        }
    }

    private String escapeJson(String value) {

        if (value == null) {
            return "";
        }

        return value
                .replace("\\", "\\\\")
                .replace("\"", "\\\"");
    }
}