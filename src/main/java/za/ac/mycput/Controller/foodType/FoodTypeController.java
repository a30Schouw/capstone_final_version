package za.ac.mycput.Controller.foodType;
/*
FoodTypeController.java
Controller class for domain class FoodType
@author: Anicka Schouw 217284183
Date: October 2022
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.Domain.FoodType;
import za.ac.mycput.Service.foodType.IFoodTypeService;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("Food-distribution/foodType/")
@Slf4j
public class FoodTypeController
{
    private final IFoodTypeService typeService;

    @Autowired
    public FoodTypeController(IFoodTypeService typeService) {
        this.typeService = typeService;
    }


    @PostMapping("save")
    public ResponseEntity<FoodType> save(@Valid @RequestBody FoodType foodType)
    {
        log.info("save request: {}", foodType);
        FoodType save=typeService.save(foodType);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<FoodType> read (@PathVariable String foodName)
    {
        log.info("Read request: {}", foodName);
        FoodType foodType=this.typeService.read(foodName);
        return ResponseEntity.ok(foodType);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void>delete(@PathVariable String foodName)
    {
        log.info("Read Request: {}", foodName);
        this.typeService.delete(foodName);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<Set<FoodType>> getAll(){
        Set<FoodType> foodType =this.typeService.getAll();
        return ResponseEntity.ok(foodType);
    }
}
