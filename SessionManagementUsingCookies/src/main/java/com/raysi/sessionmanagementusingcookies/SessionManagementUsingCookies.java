package com.raysi.sessionmanagementusingcookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ("/index")
public class SessionManagementUsingCookies extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String inputUserId = req.getParameter("userId");
        if (username != null && inputUserId != null) {
            Cookie cookie = new Cookie("userId", inputUserId);
            cookie.setMaxAge(60 * 60); // 1 hour
            cookie.setHttpOnly(true);
            cookie.setSecure(false); // Assuming HTTPS
            resp.addCookie(cookie);
            resp.sendRedirect("/home");
        }

    }
}
