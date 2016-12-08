package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nick on 20.11.16.
 */
public class Admin extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", DataBase.getProducts());
        req.getRequestDispatcher("/WEB-INF/jsps/admin.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("Function") != null){
            if(req.getParameter("Function").equalsIgnoreCase("Update")) {
                String responseString = "Function Update: OK, ID: " + req.getParameter("Id");
                System.out.println(responseString);
                resp.getOutputStream().write(responseString.getBytes());
            }
        }

    }
}

