package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/ConfigContext", initParams = {
        @jakarta.servlet.annotation.WebInitParam(name = "developer", value = "Avinash"),
        @jakarta.servlet.annotation.WebInitParam(name = "technology", value = "Servlets")
})
public class ConfigContextServlet extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        // ServletConfig
        ServletConfig config = getServletConfig();

        String developer = config.getInitParameter("developer");
        String technology = config.getInitParameter("technology");

        // ServletContext
        ServletContext context = getServletContext();

        String applicationName = context.getInitParameter("applicationName");

        String trainingModule = context.getInitParameter("trainingModule");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Config and Context</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h1>Servlet Config and Servlet Context</h1>");

        out.println("<h2>ServletConfig Parameters</h2>");

        out.println("<table border='1' cellpadding='8'>");

        out.println("<tr>");
        out.println("<th>Parameter Name</th>");
        out.println("<th>Parameter Value</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>developer</td>");
        out.println("<td>" + developer + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>technology</td>");
        out.println("<td>" + technology + "</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("<h2>ServletContext Parameters</h2>");

        out.println("<table border='1' cellpadding='8'>");

        out.println("<tr>");
        out.println("<th>Parameter Name</th>");
        out.println("<th>Parameter Value</th>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>applicationName</td>");
        out.println("<td>" + applicationName + "</td>");
        out.println("</tr>");

        out.println("<tr>");
        out.println("<td>trainingModule</td>");
        out.println("<td>" + trainingModule + "</td>");
        out.println("</tr>");

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");
    }
}