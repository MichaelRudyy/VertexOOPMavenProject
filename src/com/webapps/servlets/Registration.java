package com.webapps.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by nick on 19.11.16.
 */
public class Registration extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("Name") != null && req.getParameter("Email") != null && req.getParameter("Pass") != null) {
            String name = req.getParameter("Name");
            String email = req.getParameter("Email");
            String pass = req.getParameter("Pass");



            String responsString = "Creat User: " + "Name: " + name + " Email: " + email + " Password " + pass;
            System.out.println(responsString);
            resp.getOutputStream().write(responsString.getBytes());
        }else {
            String s = "UserError";
            resp.getOutputStream().write(s.getBytes());
        }
    }

}
