package com.example.admission_application;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");
//
//        // Hello
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        String fName = request.getParameter("fName");
        String lastName = request.getParameter("lName");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String facultyOfInterest = request.getParameter("faculty");
        String department = request.getParameter("department");
        String address = request.getParameter("address");
        String nationality = request.getParameter("nationality");
//        Part documentPart = request.getPart("documentUpload");

        // Check if all input fields are filled
        if (fName != null && !fName.isEmpty() &&
                lastName != null && !lastName.isEmpty() &&
                email != null && !email.isEmpty() &&
                phoneNumber != null && !phoneNumber.isEmpty() &&
                dateOfBirth != null && !dateOfBirth.isEmpty() &&
                facultyOfInterest != null && !facultyOfInterest.isEmpty() &&
                department != null && !department.isEmpty() &&
                address != null && !address.isEmpty() &&
                nationality != null && !nationality.isEmpty()
//               && documentPart != null && documentPart.getSize()>0
        ){
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<p>" + "First name:" + fName + "</p>");
            out.println("<p>" + "Last name:" + lastName + "</p>");
            out.println("<p>" + "email:" + email + "</p>");
            out.println("<p>" + "phone number:" + phoneNumber + "</p>");
            out.println("<p>" + "date of birth:" + dateOfBirth + "</p>");
            out.println("<p>" + "Faculty of interest:" + facultyOfInterest + "</p>");
            out.println("<p>" + "department:" + department + "</p>");
            out.println("<p>" + "address:" + address + "</p>");
            out.println("<p>" + "nationaliy:" + nationality + "</p>");
//            out.println("<p>" + "First name:" + fName + "</p>");
            out.println("</body></html>");

        } else{
            // Some input fields are empty, handle the validation failure
            response.getWriter().println("Please fill in all required fields");
        }
}
}