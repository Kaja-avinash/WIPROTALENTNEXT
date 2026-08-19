package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SessionTracking")
public class SessionTrackingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Session Tracking</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Session Tracking</h1>");

        out.println("<p><b>Number of times you visited this page:</b> "
                + visitCount + "</p>");

        out.println("<p><b>Session ID:</b> "
                + session.getId() + "</p>");

        out.println("<p><b>Creation Time:</b> "
                + session.getCreationTime() + "</p>");

        out.println("<p><b>Last Accessed Time:</b> "
                + session.getLastAccessedTime() + "</p>");

        out.println("<p><b>Is New Session:</b> "
                + session.isNew() + "</p>");

        out.println("<p><b>Max Inactive Interval:</b> "
                + session.getMaxInactiveInterval() + " seconds</p>");

        out.println("</body>");
        out.println("</html>");
    }
}