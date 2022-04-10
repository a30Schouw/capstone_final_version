package za.ac.mycput.Entity;
/*
ProductsSold.java
Entity for the Products Sold
Author: Damian du Toit (219200203)
Date: 06 April 2022
*/

public class ProductsSold {

    public String ProductName;
    public int AmountOfProduct;

    public ProductsSold(Builder builder) {
        this.ProductName = builder.ProductName;
        this.AmountOfProduct = builder.AmountOfProduct;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getAmountOfProduct() {
        return AmountOfProduct;
    }

    public void setAmountOfProduct(int amountOfProduct) {
        AmountOfProduct = amountOfProduct;
    }

    public static class Builder {
        public String ProductName;
        public int AmountOfProduct;

        public Builder setProductName(String ProductName) {
            this.ProductName = ProductName;
            return this;
        }

        public Builder setAmountOfProduct(int AmountOfProduct) {
            this.AmountOfProduct = AmountOfProduct;
            return this;
        }

        public Builder copy(ProductsSold productsSold){
            this.ProductName = productsSold.ProductName;
            this.AmountOfProduct = productsSold.AmountOfProduct;
            return this;
        }

        public ProductsSold build(){
            return new ProductsSold(this);
        }
    }
}
