package za.ac.mycput.Service.foodItem;
/*
IFoodItemService.java
FoodItem Service Interface for FoodItem Domain
@author: Anicka Schouw 217284183
Date: October 2022
 */
import za.ac.mycput.Domain.FoodItem;
import za.ac.mycput.Service.IService;

import java.util.Set;

public interface IFoodItemService extends IService<FoodItem, String>
{
    Set<FoodItem> getAll();
}

