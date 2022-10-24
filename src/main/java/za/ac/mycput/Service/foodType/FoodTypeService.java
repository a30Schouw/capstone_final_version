package za.ac.mycput.Service.foodType;
/*
FoodTypeService.java
Service class for FoodType Domain
@author: Anicka Schouw 217284183
Date: October 2022
 */

import org.springframework.stereotype.Service;
import za.ac.mycput.Domain.FoodType;
import za.ac.mycput.Repository.FoodType.IFoodTypeRepository;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class FoodTypeService implements IFoodTypeService {
    private final IFoodTypeRepository foodTypeRepository;

    public FoodTypeService(IFoodTypeRepository foodTypeRepository) {
        this.foodTypeRepository = foodTypeRepository;


    }

    @Override
    public Set<FoodType> getAll() {
        return this.foodTypeRepository.findAll().stream().collect(Collectors.toSet());
    }

    @Override
    public FoodType save(FoodType foodType) {
        return this.foodTypeRepository.save(foodType);
    }

    @Override
    public FoodType read(String foodName)
    {
        return this.foodTypeRepository.findById(foodName).orElse(null);
    }

    @Override
    public FoodType update(FoodType foodType)
    {
        if(this.foodTypeRepository.existsById(foodType.getFoodName()))
            return  this.foodTypeRepository.save(foodType);
        return foodType;
    }

    @Override
    public boolean delete(String foodName)
    {
        this.foodTypeRepository.deleteById(foodName);

        if(this.foodTypeRepository.existsById(foodName))
        {return false;
        }else{
            return true;
        }
    }
}
