package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FirstVisit")
public class FirstVisitServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        boolean firstVisit = true;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {

                if ("visited".equals(cookie.getName())) {
                    firstVisit = false;
                    break;
                }
            }
        }

        // Create a cookie to remember this visitor
        if (firstVisit) {
            Cookie visitedCookie = new Cookie("visited", "true");

            // Keep cookie for 1 day
            visitedCookie.setMaxAge(24 * 60 * 60);

            response.addCookie(visitedCookie);
        }

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>First Visit</title>");
        out.println("</head>");

        out.println("<body>");

        if (firstVisit) {
            out.println("<h1>Welcome, you are visiting for the first time.</h1>");
        } else {
            out.println("<h1>Welcome Back.</h1>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}