package servlets;
/**
 * Created by nick on 19.11.16.
 */
public class Product {
    int id;
    String title;
    String description;
    Double price;
    String imgUrl;

    public Product(int id, String title, String description, Double price, String imgUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
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
}
