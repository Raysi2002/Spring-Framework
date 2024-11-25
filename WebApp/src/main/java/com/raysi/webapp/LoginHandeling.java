package com.raysi.webapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Serial;
import java.sql.*;

//@WebServlet("/login")
public class LoginHandeling extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;
    private static final String url = "jdbc:mysql://localhost:3306/JDBC";
    private static final String username = "root";
    private static final String pass = "Raysi@2002";
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String email =  req.getParameter("email");
       String password = req.getParameter("password");
        System.out.println("Email: " + email + "\nPassword: " + password);
        if (isDataCorrect(email, password)) {
            // Redirect to a welcome or dashboard page on successful login
            resp.sendRedirect("home.jsp");
        } else {
            // Redirect back to the login page with an error message
            req.setAttribute("errorMessage", "Invalid email or password");
            req.getRequestDispatcher("invalidLogin.jsp").forward(req, resp);
        }
        }

    private static boolean isDataCorrect(String email, String password){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, pass);
            String query = "SELECT * FROM login WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                String dbEmail = resultSet.getString("email");
                String dbPassword = resultSet.getString("password");

                return dbEmail.equals(email.toLowerCase()) && dbPassword.equals(password);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}