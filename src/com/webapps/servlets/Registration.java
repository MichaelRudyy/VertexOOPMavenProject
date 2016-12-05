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

        boolean isNotInBase = false;
        if(DataBase.getUserByEmail(req.getParameter("Email"))==null){
            isNotInBase=true; 
        }
        if (!req.getParameter("Name").equals("") && !req.getParameter("Email").equals("") && !req.getParameter("Pass").equals("") && (isNotInBase==true)) {
            String name = req.getParameter("Name");
            String email = req.getParameter("Email");
            String pass = req.getParameter("Pass");

            String msg = "Login User: " + "Name: " + name + " Email: " + email + " Password " + pass;
            DataBase.insertUser(name,email,pass);
            resp.getOutputStream().write(msg.getBytes());
        }else if (isNotInBase==false) {
            String msg = "This user is already registred";
            resp.getOutputStream().write(msg.getBytes());
        }else{
            String s = "UserError";
            resp.getOutputStream().write(s.getBytes());
        }
    }

}
