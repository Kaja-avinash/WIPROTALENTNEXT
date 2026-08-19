package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Parameters")
public class ParameterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        showParameters(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        showParameters(request, response);
    }

    private void showParameters(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Request Parameters</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>Request Parameters</h1>");

        out.println("<p><b>Request Method:</b> "
                + request.getMethod() + "</p>");

        out.println("<table border='1' cellpadding='8'>");

        out.println("<tr>");
        out.println("<th>Parameter Name</th>");
        out.println("<th>Parameter Value</th>");
        out.println("</tr>");

        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {

            String parameterName = parameterNames.nextElement();

            String[] parameterValues = request.getParameterValues(parameterName);

            out.println("<tr>");

            out.println("<td>" + parameterName + "</td>");

            out.println("<td>");

            if (parameterValues != null) {
                for (String value : parameterValues) {
                    out.println(value + "<br>");
                }
            }

            out.println("</td>");
            out.println("</tr>");
        }

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }
}