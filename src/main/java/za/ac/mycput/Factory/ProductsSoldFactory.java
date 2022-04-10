package za.ac.mycput.Factory;

import za.ac.mycput.Entity.ProductsSold;
/*
ProductsSoldFactory.java
Factory for the ProductsSold
Author: Damian du Toit (219200203)
Date: 07 April 2022
*/

public class ProductsSoldFactory {

    public static ProductsSold productsSold(String ProductName, int AmountOfProduct) {

        if (ProductName.isEmpty() || AmountOfProduct <= 0)
            return null;

        ProductsSold productsSold = new ProductsSold.Builder()
                .setProductName(ProductName)
                .setAmountOfProduct(AmountOfProduct)
                .build();

        return productsSold;
    }
}