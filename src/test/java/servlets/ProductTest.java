package servlets;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vadimdemeshyn on 05.12.16.
 */
public class ProductTest {
    @Test
    public void getId() throws Exception {
        Product product = new Product(5, "","", 6.44, "http/lol");
        Assert.assertEquals(5, product.getId());
        Assert.assertEquals("", product.getDescription());
    }

    @Test
    public void getTitle() throws Exception {

    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test
    public void getPrice() throws Exception {

    }

    @Test
    public void getImgUrl() throws Exception {

    }

}