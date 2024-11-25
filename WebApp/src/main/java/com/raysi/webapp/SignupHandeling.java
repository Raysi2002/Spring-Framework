package com.raysi.webapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.sql.*;

//@WebServlet("/signup")
public class SignupHandeling extends HttpServlet {
    @Serial
    private static final long serialUID = 1L;
    private static final String url = "jdbc:mysql://localhost:3306/JDBC";
    private static final String username = "root";
    private static final String pass = "Raysi@2002";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String firstName = req.getParameter("firstName");
        String middleName = req.getParameter("middleName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String agreement = req.getParameter("agreement");

        PrintWriter printWriter = resp.getWriter();

        if (!isUserExist(email)) {
            addDataIntoDB(firstName, middleName, lastName, email, phone, password, confirmPassword);
            addLoginCredentials(email, password, confirmPassword);
            printWriter.println("""
                <HTML>
                <script> alert("Signup Successful !! Please Login to Continue ...");
                setTimeout(function(){
                window.location = '/WebApp/index.jsp';
                }, 0);
                </script>
                </HTML> """);
            try {
                resp.wait(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resp.sendRedirect("/WebApp/index.jsp");
        }
        else{
            printWriter.println("""
                    <html>
                        <script> alert("User already exists! Please login to continue");
                         setTimeout(function(){
                         window.location = '/WebApp/index.jsp';
                         }, 0);
                         </script>
                    </html>""");
            try {
                resp.wait(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resp.sendRedirect("/WebApp/index.jsp");

        }
    }

    private static void addDataIntoDB(String fName, String mName, String lName, String email, String phone, String password, String confirmPass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, pass);
            String query = "INSERT INTO signup VALUES (?, ?, ?, ?, ?, ?, ?, current_timestamp())";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, fName);
            preparedStatement.setString(2, mName);
            preparedStatement.setString(3, lName);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, phone);
            preparedStatement.setString(6, password);
            preparedStatement.setString(7, confirmPass);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0)
                System.out.println("Data inserted in DB");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private  static  boolean isUserExist(String email){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, pass);
            String query = "SELECT email from signup where email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                String dbEmail = resultSet.getString("email");
                if (email.equals(dbEmail))
                    return true;
                else
                    return false;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static void addLoginCredentials(String email, String password, String confirmPassword){
        if (password.equals(confirmPassword)){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            }catch (ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
            try {
                Connection connection = DriverManager.getConnection(url, username, pass);
                String query =  "INSERT INTO login VALUES (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);
                int affectedRows = preparedStatement.executeUpdate();
                if (affectedRows > 0)
                    System.out.println("Signup data inserted into login data");
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
