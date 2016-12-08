

import junit.framework.Assert;
import static org.junit.Assert.*;

import org.junit.Test;
import servlets.Product;

/**
 * Created by vadimdemeshyn on 05.12.16.
 */
public class TestProduct {

    @Test
    public void test() {
        Product product = new Product(5, "","", 6.44, "http/lol");
        Assert.assertEquals(5, product.getId());
        Assert.assertEquals("", product.getDescription());


    }

}
