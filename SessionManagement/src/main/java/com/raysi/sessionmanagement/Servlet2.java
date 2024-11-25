package com.raysi.sessionmanagement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        var writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        var flag = false;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                if (name.equals("username")) {
                    writer.println("<h1>" + cookie.getValue() + "</h1>");
                    flag = true;
                }
            }
        }
        if (!flag){
            writer.println("<h1>You are not logged in</h1>");
        }
    }
}
