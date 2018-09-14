package com.ayush.controller;

import com.ayush.model.ConnectionProvider;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

@WebServlet(name = "ApprovalServlet", urlPatterns = {"/ApprovalServlet"})
public class ApprovalServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int c = Integer.parseInt(request.getParameter("count"));
            String warden = request.getParameter("warden");

            String[] mix = new String[c - 1];
            String[] approved = new String[c - 1];
            String[] name = new String[c - 1];

            for (int i = 0; i < c - 1; i++) {
                mix[i] = request.getParameter("check" + (i + 1));
                System.out.println(mix[i]);
            }
            for (int j = 0; j < c - 1; j++) {
                approved[j] = mix[j].substring(0, 8);
                name[j] = mix[j].substring(8);
            }
            ResultSet rs = null;
            String a = null;
            String bb = null;
            String pass = null;
            String to = null;
            String from = null;
            String subject = null;
            String messageText = null;
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();

            rs = stmt.executeQuery("select hostelname from adminregister where aid='" + warden + "'");
            while (rs.next()) {
                bb = rs.getString("hostelname");
            }
            String host = "smtp.gmail.com";
            String user = "ayushjha1114@gmail.com";
            pass = "Ayush1411Jha";
            if (bb.equals("Malviya Bhawan")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("Vivekanand Bhawan")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("Patel Bhawan")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("LMR")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("Navyug")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("Sarojini Bhawan")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("MBA")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("E Block")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            }
            if (bb.equals("D Block")) {
                for (int x = 0; x < c - 1; x++) {
                    stmt.executeUpdate("update allotment  set approval='" + approved[x] + "' where name='" + name[x] + "'");
                    rs = stmt.executeQuery("select email from student where name='" + name[x] + "'");
                    while (rs.next()) {
                        a = rs.getString("email");
                    }
                    to = a;
                    from = "ayushjha1114@gmail.com";
                    subject = "You're successfully registered";
                    messageText = "Your login password is " + name[x] + x;
                    stmt.executeUpdate("update allotment  set password='" + name[x] + x + "' where name='" + name[x] + "'");
                    boolean sessionDebug = false;

                    Properties props = System.getProperties();

                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", host);
                    props.put("mail.smtp.port", "587");
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.required", "true");

                    java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
                    Session mailSession = Session.getDefaultInstance(props, null);
                    mailSession.setDebug(sessionDebug);
                    Message msg = new MimeMessage(mailSession);
                    msg.setFrom(new InternetAddress(from));
                    InternetAddress[] address = {new InternetAddress(to)};
                    msg.setRecipients(Message.RecipientType.TO, address);
                    msg.setSubject(subject);
                    msg.setSentDate(new Date());
                    msg.setText(messageText);

                    Transport transport = mailSession.getTransport("smtp");
                    transport.connect(host, user, pass);
                    transport.sendMessage(msg, msg.getAllRecipients());
                    transport.close();
                    System.out.println("message send successfully");

                }
                request.getRequestDispatcher("approved.jsp").forward(request, response);
            } else {
                System.out.println("elsepart");

                request.getRequestDispatcher("failure.jsp").forward(request, response);
            }

            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            msg.setText(messageText);

            Transport transport = mailSession.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(msg, msg.getAllRecipients());
            transport.close();
            System.out.println("message send successfully");
            request.getRequestDispatcher("approved.jsp").forward(request, response);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
