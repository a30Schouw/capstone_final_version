package za.ac.mycput.Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.ProductsSold;
/*
ProductsSoldFactoryTest.java
Test for the ProductsSoldFactory
Author: Damian du Toit (219200203)
Date: 08 April 2022
*/

public class ProductsSoldFactoryTest {
    @Test
    public void test()
    {
        ProductsSold productsSold = new ProductsSold.Builder()
                .setProductName("Frozen Peas")
                .setAmountOfProduct(2)
                .build();

        System.out.println(productsSold.toString());
        Assertions.assertNotNull(productsSold);
    }
}
