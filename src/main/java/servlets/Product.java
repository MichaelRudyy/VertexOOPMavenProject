package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by nick on 19.11.16.
 */
public class Product extends HttpServlet {
    private int id;
    private String title;
    private String description;
    private Double price;
    private String imgUrl;
    private int soldTimes;
    private int available;

    public Product(){}

    public Product(int id, String title, String description, Double price, String imgUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public Product(int id, String title, String description, Double price, String imgUrl, int available) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
        this.available = available;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public int getSoldTimes() {return soldTimes;}

    public int getAvailable() {return available;}


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        if (!req.getParameter("ProductId").equalsIgnoreCase("")){
//            String productId = req.getParameter("ProductId");
//            DataBase.getProduct(productId);
//        }

            String productIdForBuy = req.getParameter("Id");
            System.out.println(productIdForBuy);
        DataBase.buyProduct(productIdForBuy);
            String responseString = "You bought this product.";
            resp.getOutputStream().write(responseString.getBytes());




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
