package za.ac.mycput.Repository.ProductsSold;

import za.ac.mycput.Entity.ProductsSold;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

/*
IProductsSoldRepository.java
IRepository for the ProductsSold
Author: Damian du Toit (219200203)
Date: 07 April 2022
*/
public interface IProductsSoldRepository extends IRepository<ProductsSold,String> {
    public Set<ProductsSold> getAll();
}
