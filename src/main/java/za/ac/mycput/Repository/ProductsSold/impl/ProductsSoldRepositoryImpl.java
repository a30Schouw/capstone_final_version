package za.ac.mycput.Repository.ProductsSold.impl;

import za.ac.mycput.Entity.ProductsSold;
import za.ac.mycput.Repository.ProductsSold.IProductsSoldRepository;

import java.util.HashSet;
import java.util.Set;

/*
ProductsSoldRepositoryImpl.java
Repository Impl for the ProductsSold
Author: Damian du Toit (219200203)
Date: 07 April 2022
*/
public class ProductsSoldRepositoryImpl implements IProductsSoldRepository {
    private static ProductsSoldRepositoryImpl repository = null;
    private Set<ProductsSold> productsSoldDB = null;

    private ProductsSoldRepositoryImpl(){
        productsSoldDB = new HashSet<ProductsSold>();
    }

    public static ProductsSoldRepositoryImpl getRepository(){
        if (repository == null){
            repository = new ProductsSoldRepositoryImpl();
        }
        return repository;
    }

    @Override
    public ProductsSold create(ProductsSold productsSold){

        boolean created = productsSoldDB.add(productsSold);
        if (!created)
            return null;
        return productsSold;
    }

    @Override
    public ProductsSold read(String productsSold){
        for (ProductsSold p : productsSoldDB){
            if (p.getProductName().equals(productsSold))
                return p;
        }
        return null;

    }

    @Override
    public ProductsSold update(ProductsSold productsSold){

        ProductsSold old = read(productsSold.getProductName());
        if (old != null){
            productsSoldDB.remove(old);
            productsSoldDB.add(productsSold);
            return productsSold;
        }
        return null;
    }

    @Override
    public boolean delete(String productsSold){
        ProductsSold productsSoldToDelete = read(productsSold);
        if (productsSoldToDelete == null)
            return false;
        productsSoldDB.remove(productsSoldToDelete);
        return true;
    }

    @Override
    public Set<ProductsSold> getAll(){
        return productsSoldDB;
    }
}
