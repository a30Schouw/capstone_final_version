package za.ac.mycput.Repository.customer.impl;

import org.junit.Test;
import za.ac.mycput.Entity.ProductsSold;
import za.ac.mycput.Factory.ProductsSoldFactory;
import za.ac.mycput.Repository.ProductsSold.impl.ProductsSoldRepositoryImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
/*
ProductsSoldRepositoryTest.java
Test for the ProductsSoldRepository
Author: Damian du Toit (219200203)
Date: 08 April 2022
*/

public class ProductsSoldRepositoryTest {
    private static ProductsSoldRepositoryImpl repository = ProductsSoldRepositoryImpl.getRepository();
    private static ProductsSold productsSold = ProductsSoldFactory.productsSold("Frozen Peas", 5);
    private static ProductsSold productsSold2 = ProductsSoldFactory.productsSold("2L Milk", 6);

    @Test
    public void a_Create()
    {
        ProductsSold create = repository.create(productsSold);
        assertEquals(productsSold.getProductName(), create.getProductName());
        System.out.println("Create: " + create);
    }

    @Test
    public void b_Read()
    {
        ProductsSold Create = repository.create(productsSold2);
        ProductsSold productsSoldRead = repository.read(Create.getProductName());
        assertNotNull(Create.getProductName(),productsSold.getProductName());
        System.out.println("Read : " + productsSoldRead);
    }

    @Test
    public void c_Update()
    {
        ProductsSold Create=repository.create(productsSold);
        ProductsSold productsSoldUpdate = new ProductsSold.Builder().copy(productsSold)
                .setProductName("Milk")
                .build();
        productsSoldUpdate = repository.update(productsSoldUpdate);
        System.out.println("Old: "+ productsSold);
        System.out.println("Updated Product name: " + productsSoldUpdate);

    }

    @Test
    public void d_Delete()
    {
        ProductsSold Create = repository.create(productsSold);
        repository.delete(Create.getProductName());
        System.out.println("Deleted: "+ Create.getProductName());
    }
    @Test
    public void e_GetAll()
    {
        System.out.println("Products: "+ repository.getAll());
    }
}
