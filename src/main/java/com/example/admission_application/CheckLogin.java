package com.example.admission_application;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "CheckLogin", value = "/CheckLogin")
public class CheckLogin extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
       String username = request.getParameter("uname");
       String password = request.getParameter("password");

       if(username.equals("Brenda") && password.equals("abc123")){
response.sendRedirect("homepage.jsp");
       }else{
           response.sendRedirect("index.jsp");
           System.out.println("Login failed please try again");;
       }

    }

    public void destroy() {
    }
}
