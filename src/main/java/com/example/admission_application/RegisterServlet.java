package com.example.admission_application;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.mail.Session;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
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


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        final Session emailSession = EmailConfig.configureEmail();
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
        ) {
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

        } else {
            // Some input fields are empty, handle the validation failure
            response.getWriter().println("Please fill in all required fields");
        }
        sendEmail(fName, lastName, email, phoneNumber, dateOfBirth, facultyOfInterest, department, address, nationality);
    }
    private void sendEmail(String fName, String lastName, String email, String phoneNumber, String dateOfBirth,
                           String facultyOfInterest, String department, String address, String nationality) {
        // Set up properties for the email
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP server
        props.put("mail.smtp.port", "587"); //  SMTP port

        // a Session with the provided properties and Authenticator
        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("brewihogora23@gmail.com", "whatever0987&"); // Replace with your email and password
            }
        });

        try {
            // Create a MimeMessage
            Message message = new MimeMessage(session);

            // Set the sender's and recipient's email addresses
            message.setFrom(new InternetAddress("brewihogora23@gmail.com")); // Replace with your email
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));

            // Set the email subject and body
            message.setSubject("Admission Application Confirmation");
            message.setText("Dear " + fName + " " + lastName + ",\n\n"
                    + "Thank you for submitting your admission application.\n\n"
                    + "Details:\n"
                    + "Email: " + email + "\n"
                    + "Phone Number: " + phoneNumber + "\n"
                    + "Date of Birth: " + dateOfBirth + "\n"
                    + "Faculty of Interest: " + facultyOfInterest + "\n"
                    + "Department: " + department + "\n"
                    + "Address: " + address + "\n"
                    + "Nationality: " + nationality + "\n\n"
                    + "Your application has been received. We will get back to you soon.\n\n"
                    + "Best regards,\n"
                    + "Admission Office");

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}