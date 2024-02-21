package com.example.admission_application;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

    public class EmailConfig {

        public static Session configureEmail() {
            final String username = "brewihogora23@gmail.com"; // Replace with your email
            final String password = "whatever0987&"; // Replace with your email password

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com"); // SMTP server
            props.put("mail.smtp.port", "587"); // your SMTP port

            return Session.getInstance(props, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
        }
    }

