package za.ac.mycput.Service.foodItem;
/*
FoodItemService.java
Service class for FoodItem Domain
@author: Anicka Schouw 217284183
Date: October 2022
 */

import org.springframework.stereotype.Service;
import za.ac.mycput.Domain.FoodItem;
import za.ac.mycput.Repository.FoodItem.IFoodItemRepository;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FoodItemService implements IFoodItemService {
    private final IFoodItemRepository foodItemRepository;

    public FoodItemService(IFoodItemRepository foodItemRepository) {
        this.foodItemRepository = foodItemRepository;


    }

    @Override
    public Set<FoodItem> getAll() {
        return this.foodItemRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public FoodItem save(FoodItem foodItem) {
        return this.foodItemRepository.save(foodItem);
    }

    @Override
    public FoodItem read(String itemID)
    {
        return this.foodItemRepository.findById(itemID).orElse(null);
    }

    @Override
    public FoodItem update(FoodItem foodItem)
    {
        if(this.foodItemRepository.existsById(foodItem.getItemID()))
            return  this.foodItemRepository.save(foodItem);
        return foodItem;
    }

    @Override
    public boolean delete(String itemID)
    {
        this.foodItemRepository.deleteById(itemID);
        if(this.foodItemRepository.existsById(itemID))
        {return false;

        }else{
            return true;
        }
    }
}