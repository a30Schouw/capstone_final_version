package za.ac.mycput.Service.foodType;
/*
IFoodTypeService.java
FoodType class Service Interface for FoodType Domain
@author: Anicka Schouw 217284183
Date: October 2022
 */

import za.ac.mycput.Domain.FoodType;
import za.ac.mycput.Service.IService;

import java.util.Set;

public interface IFoodTypeService extends IService<FoodType, String>
{
    Set<FoodType> getAll();
}
