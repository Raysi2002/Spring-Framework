package com.raysi.webapp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


public class ResetPassword extends HttpServlet {
    private static final String url = "jdbc:mysql://localhost:3306/JDBC";
    private static final String username = "root";
    private static final String pass = "Raysi@2002";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("reset password servlet called");
        String email = req.getParameter("email");
        String newPassword = req.getParameter("password");
        String confirmNewPassword = req.getParameter("confirmPassword");

        PrintWriter printWriter = resp.getWriter();
        if (!newPassword.equals(confirmNewPassword)){
            printWriter.println("""
                    <html>
                        <script>
                            alert("Password didn't matched");
                            window.history.back();
                        </script>
                    </html>""");
            System.out.println("Password didn't matched");
            return;
        }
        boolean isUpdated = updatePassword(email, newPassword);
        if (isUpdated){
            printWriter.println("""
                    <html>
                        <script>
                            alert("Password updated successfully");
                            setTimeout(function(){
                                window.location = '/WebApp/index.jsp';
                            }, 1000);
                        </script>
                    </html>""");
            System.out.println("Password updated successfully");
        }else {
            printWriter.println("""
                    <html>
                        <script>
                            alert("Error occurred in updating password");
                            window.history.back();
                        </script>
                    </html>""");
            System.out.println("Error in updating password");
        }
    }

    private static boolean updatePassword(String email, String newPassword){
        boolean isUpdated = false;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, username, pass);
//                Statement statement = connection.createStatement();
//                statement.execute("SET SQL_SAFE_UPDATES = 0");
            String updateQuery = "UPDATE signup SET password = ?, confirmPassword = ?  WHERE email = ?";
            String updateQueryLogin = "UPDATE login SET password = ? WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, newPassword);
            preparedStatement.setString(3, email);
            //updating login credentials
            PreparedStatement preparedStatement1 = connection.prepareStatement(updateQueryLogin);
            preparedStatement1.setString(1, newPassword);
            preparedStatement1.setString(2, email);
            preparedStatement1.executeUpdate();
            int affectedRows = preparedStatement.executeUpdate();

            isUpdated = (affectedRows > 0);
//                statement.execute("SET SQL_SAFE_UPDATES = 1");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return isUpdated;
    }

}
