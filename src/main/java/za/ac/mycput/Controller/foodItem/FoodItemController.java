package za.ac.mycput.Controller.foodItem;
/*
FoodItemController.java
Controller class for domain class FoodItem
@author: Anicka Schouw 217284183
Date: October 2022
 */
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.Domain.FoodItem;
import za.ac.mycput.Service.foodItem.IFoodItemService;

import javax.validation.Valid;
import java.util.Set;

@RestController
@RequestMapping("Food-distribution/foodItem/")
@Slf4j
public class FoodItemController
{
    private final IFoodItemService itemService;

    @Autowired
    public FoodItemController(IFoodItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("save")
    public ResponseEntity<FoodItem> save(@Valid @RequestBody FoodItem foodItem)
    {
        log.info("save request: {}", foodItem);
        FoodItem save=itemService.save(foodItem);
        return ResponseEntity.ok(save);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<FoodItem> read (@PathVariable String id)
    {
        log.info("Read request: {}", id);
        FoodItem foodItem=this.itemService.read(id);
        return ResponseEntity.ok(foodItem);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void>delete(@PathVariable String id)
    {
        log.info("Read Request: {}", id);
        this.itemService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("all")
    public ResponseEntity<Set<FoodItem>> getAll(){
        Set<FoodItem> foodItem =this.itemService.getAll();
        return ResponseEntity.ok(foodItem);
    }
}
