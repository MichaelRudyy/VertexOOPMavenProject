package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Main extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {
            req.setAttribute("product", DataBase.getProducts());
            req.getRequestDispatcher("/WEB-INF/jsps/shop.jsp").forward(req,resp);
        }catch (Exception e){
            e.getMessage();
            String s = "Products Bad Response";
            resp.getOutputStream().write(s.getBytes());
        }
    }



}