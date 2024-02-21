package com.example.admission_application;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "CheckLogin", value = "/CheckLogin")
public class CheckLogin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("uname");
        String password = request.getParameter("password");

        if ("Brenda".equals(username) && "abc123".equals(password)) {
            // Authentication successful, set user information in session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Redirect to the homepage
            response.sendRedirect("homepage.jsp");
        } else {
            // Login failed, redirect to login page or show an error message
            System.out.println("Login failed. Please try again.");
            response.sendRedirect("login.jsp"); // Adjust the URL as needed
        }
    }
}
