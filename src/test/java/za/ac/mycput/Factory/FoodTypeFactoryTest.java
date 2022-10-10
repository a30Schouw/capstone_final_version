package za.ac.mycput.Factory;

/*FoodTypeFactoryTest.java
  Factory Test for FoodType
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.FoodType;

import static org.junit.jupiter.api.Assertions.*;

class FoodTypeFactoryTest{

    @Test
    void createFoodType(){

        FoodType foodtype = FoodTypeFactory.createFoodType("Chicken");
        assertNotNull(foodtype);
        System.out.println(foodtype);

    }
}