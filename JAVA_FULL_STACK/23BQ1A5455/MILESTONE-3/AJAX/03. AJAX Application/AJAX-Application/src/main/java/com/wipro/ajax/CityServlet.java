package com.wipro.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cities")
public class CityServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Map<String, String[]> cityData = new HashMap<>();

    static {
        cityData.put("Andhra Pradesh", new String[] {
                "Visakhapatnam",
                "Vijayawada",
                "Guntur",
                "Tirupati"
        });

        cityData.put("Telangana", new String[] {
                "Hyderabad",
                "Warangal",
                "Nizamabad",
                "Karimnagar"
        });

        cityData.put("Tamil Nadu", new String[] {
                "Chennai",
                "Coimbatore",
                "Madurai",
                "Salem"
        });

        cityData.put("Karnataka", new String[] {
                "Bengaluru",
                "Mysuru",
                "Mangaluru",
                "Hubballi"
        });

        cityData.put("Maharashtra", new String[] {
                "Mumbai",
                "Pune",
                "Nagpur",
                "Nashik"
        });
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String state = request.getParameter("state");

        PrintWriter out = response.getWriter();

        out.println("<table border='1'>");

        out.println("<tr>");
        out.println("<th>State</th>");
        out.println("<th>Important City</th>");
        out.println("</tr>");

        if (state != null && cityData.containsKey(state)) {

            String[] cities = cityData.get(state);

            for (String city : cities) {

                out.println("<tr>");
                out.println("<td>" + state + "</td>");
                out.println("<td>" + city + "</td>");
                out.println("</tr>");
            }

        } else {

            out.println("<tr>");
            out.println("<td colspan='2'>No cities found</td>");
            out.println("</tr>");
        }

        out.println("</table>");
    }
}