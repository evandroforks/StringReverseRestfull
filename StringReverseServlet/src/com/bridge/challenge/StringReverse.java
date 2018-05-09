package com.bridge.challenge;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StringReverse")
public class StringReverse extends HttpServlet {

    List<String> reversedStrings;

    /**
     * this life-cycle method is invoked when this servlet is first accessed
     * by the client
     */
    public void init(ServletConfig config) {
        System.out.println("Servlet is being initialized");
        this.reversedStrings = new ArrayList<String>();
    }

    /**
     * handles HTTP GET request
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        System.out.println("Someone is calling the Servlet doGet command");
    }

    /**
     * handles HTTP POST request
     * @throws ServletException 
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        System.out.println("Someone is calling the Servlet doPost command");

        String inputString = request.getParameter("inputString");
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Will be available as ${reversedStrings} in JSP
        request.setAttribute("reversedString", reversedString);
        request.setAttribute("reversedStrings", this.reversedStrings);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    /**
     * this life-cycle method is invoked when the application or the server
     * is shutting down
     */
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }
}
