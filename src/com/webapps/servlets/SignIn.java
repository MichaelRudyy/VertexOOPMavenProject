package com.webapps.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


public class SignIn extends HttpServlet{

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("Name");
            String msg="";
        try {
            ArrayList<User> userList = new ArrayList<>(DataBase.getUsers());
            for (User user: userList){
                if (user.getFirstName().equals(name)){
                    msg = "There is user with such name";
                    resp.getOutputStream().write(msg.getBytes());
                }
            }
              //req.getRequestDispatcher("/WEB-INF/jsps/shop.jsp").forward(req, resp);
        } catch (Exception e) {
            e.getMessage();
            String s = "Users Bad Respons";
            resp.getOutputStream().write(s.getBytes());
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (!req.getParameter("Name").equals("") && !req.getParameter("Email").equals("") && !req.getParameter("Pass").equals("")) {
            String name = req.getParameter("Name");
            String email = req.getParameter("Email");
            String pass = req.getParameter("Pass");

            String msg = "Login User: " + "Name: " + name + " Email: " + email + " Password " + pass;
            System.out.println(msg);
            resp.getOutputStream().write(msg.getBytes());
        }else {
            String s = "UserError";
            resp.getOutputStream().write(s.getBytes());
        }
    }


}
