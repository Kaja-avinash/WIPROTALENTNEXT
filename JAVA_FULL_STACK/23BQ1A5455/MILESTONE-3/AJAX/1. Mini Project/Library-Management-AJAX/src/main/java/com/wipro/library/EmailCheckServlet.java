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

@WebServlet("/check-email")
public class EmailCheckServlet extends HttpServlet {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/librarydb?useSSL=false&serverTimezone=UTC";

    private static final String DB_USER = "root";

    private static final String DB_PASSWORD = "Avinash@123";

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        String email = request.getParameter("email");

        PrintWriter out = response.getWriter();

        if (email == null || email.trim().isEmpty()) {
            out.print("{\"error\":\"Invalid email-id\"}");
            return;
        }

        email = email.trim();

        String sql =
                "SELECT EMAIL FROM XYZ_PROFILE " +
                "WHERE LOWER(EMAIL) = LOWER(?)";

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

                statement.setString(1, email);

                try (ResultSet resultSet = statement.executeQuery()) {

                    if (resultSet.next()) {

                        out.print(
                            "{\"exists\":true,\"message\":\"Email already exists!\"}"
                        );

                    } else {

                        out.print(
                            "{\"exists\":false,\"message\":\"Email is available.\"}"
                        );
                    }
                }
            }

        } catch (Exception e) {

            response.setStatus(
                    HttpServletResponse.SC_INTERNAL_SERVER_ERROR
            );

            out.print(
                "{\"error\":\"Database error occurred.\"}"
            );

            e.printStackTrace();
        }
    }
}