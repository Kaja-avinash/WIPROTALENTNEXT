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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

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
        String name = request.getParameter("name");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String gender = request.getParameter("gender");
        String occupation = request.getParameter("occupation");
        String city = request.getParameter("city");
        String mobile = request.getParameter("mobile");

        if (email == null || email.trim().isEmpty()
                || password == null || password.trim().isEmpty()
                || name == null || name.trim().isEmpty()) {

            out.print(
                "{\"success\":false,\"message\":\"Please fill all required fields.\"}"
            );
            return;
        }

        String sql =
                "INSERT INTO XYZ_PROFILE " +
                "(EMAIL, PASSWORD, NAME, DATEOFBIRTH, GENDER, " +
                "OCCUPATION, CITY, MOBILE) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

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
                statement.setString(3, name.trim());

                if (dateOfBirth == null || dateOfBirth.trim().isEmpty()) {
                    statement.setNull(
                            4,
                            java.sql.Types.DATE
                    );
                } else {
                    statement.setDate(
                            4,
                            java.sql.Date.valueOf(dateOfBirth)
                    );
                }

                statement.setString(5, gender);
                statement.setString(6, occupation);
                statement.setString(7, city);
                statement.setString(8, mobile);

                int rowsInserted = statement.executeUpdate();

                if (rowsInserted > 0) {

                    out.print(
                        "{\"success\":true," +
                        "\"message\":\"Registration successful!\"}"
                    );

                } else {

                    out.print(
                        "{\"success\":false," +
                        "\"message\":\"Registration failed.\"}"
                    );
                }
            }

        } catch (java.sql.SQLIntegrityConstraintViolationException e) {

            out.print(
                "{\"success\":false," +
                "\"message\":\"Email already exists!\"}"
            );

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
}