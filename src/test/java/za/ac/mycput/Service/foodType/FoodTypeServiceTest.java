package za.ac.mycput.Service.foodType;
/*
FoodTypeServiceTest.java
Test case for service class FoodType
@author: Anicka Schouw 217284183
Date: October 2022
 */

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.mycput.Domain.FoodType;
import za.ac.mycput.Factory.FoodTypeFactory;
import za.ac.mycput.FoodManagementSystemApplication;

import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(classes= FoodManagementSystemApplication.class)
class FoodTypeServiceTest {

    private final FoodType foodType = FoodTypeFactory.createFoodType("Main");
    private FoodType typeSaved;

    @Autowired
    private FoodTypeService typeService;

    void createFoodType(FoodType foodType)
    {
        typeSaved =  typeService.save(foodType);
    }

    @Test
    void e_getAll() {
        Set<FoodType> foodTypeSet= typeService.getAll();
        System.out.println(foodTypeSet);

    }

    @Test
    void a_save() {
        createFoodType(foodType);
        assertEquals("Main Meal",typeSaved.getFoodName());
        System.out.println(typeSaved);
    }

    @Test
    void b_read() {
        createFoodType(foodType);
        FoodType read=typeService.read(typeSaved.getFoodName());
        System.out.println("Read: "+ read);

    }

    @Test
    void c_update() {
        createFoodType(foodType);
        FoodType foodType1 = new FoodType.Builder()
                .copy(foodType)
                .setFoodName("Meal")
                .build();
        typeService.update(foodType1);
        System.out.println("updated" + foodType1);

    }

    @Test
    void d_delete() {
        createFoodType(foodType);
        boolean delete=typeService.delete(typeSaved.getFoodName());
        assertTrue(delete);
        System.out.println("Successfully deleted:"+delete);

    }
}