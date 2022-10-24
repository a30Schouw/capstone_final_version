//package za.ac.mycput.Repository.FoodItem.impl;
/*FoodItemRepository.java
  FoodItem Domain repository interface implementation
  @author: Anicka Schouw 217284183
  Date: October 2022
*/
/*
import za.ac.mycput.Domain.FoodItem;
import za.ac.mycput.Repository.FoodItem.IFoodItemRepository;

import java.util.HashSet;
import java.util.Set;

public class FoodItemRepositoryImpl implements IFoodItemRepository {

    private static FoodItemRepositoryImpl repository = null;
    private Set<FoodItem> foodItemDB = null;

    private FoodItemRepositoryImpl(){
        foodItemDB = new HashSet<FoodItem>();
    }

    public static FoodItemRepositoryImpl getRepository(){
        if (repository == null){
            repository = new FoodItemRepositoryImpl();
        }
        return repository;
    }

    @Override
    public FoodItem create(FoodItem foodItem){

        boolean created = foodItemDB.add(foodItem);
        if (!created)
            return null;
        return foodItem;
    }

    @Override
    public FoodItem read(String itemName){
        for (FoodItem f : foodItemDB){
            if (f.getItemName().equals(itemName))
                return f;
        }
        return null;

    }

    @Override
    public FoodItem update(FoodItem foodItem){

        FoodItem old = read(foodItem.getItemName());
        if (old != null){
            foodItemDB.remove(old);
            foodItemDB.add(foodItem);
            return foodItem;
        }
        return null;
    }

    @Override
    public boolean delete(String itemName){
        FoodItem foodItemDelete = read(itemName);
        if (foodItemDelete == null)
            return false;
        foodItemDB.remove(foodItemDelete);
        return true;
    }

    @Override
    public Set<FoodItem> getAll(){
        return foodItemDB;
    }
}

 */
