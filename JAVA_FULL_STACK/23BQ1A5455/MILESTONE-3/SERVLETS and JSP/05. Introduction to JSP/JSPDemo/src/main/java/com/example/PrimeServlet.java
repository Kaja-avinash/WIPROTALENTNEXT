package com.example;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String numberText = request.getParameter("number");

        int number = Integer.parseInt(numberText);

        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i < number; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeNumbers.add(i);
            }
        }

        request.setAttribute("primeNumbers", primeNumbers);
        request.setAttribute("number", number);

        request.getRequestDispatcher("prime.jsp")
                .forward(request, response);
    }
}