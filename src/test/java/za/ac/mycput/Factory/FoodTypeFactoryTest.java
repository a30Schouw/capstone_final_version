package za.ac.mycput.Factory;

/*FoodTypeFactoryTest.java
  Factory Test for FoodType domain
  @author: Anicka Schouw 217284183
  Date: October 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.mycput.Domain.FoodType;

import static org.junit.jupiter.api.Assertions.*;

class FoodTypeFactoryTest{

    @Test
    void createFoodType(){

        FoodType foodtype = FoodTypeFactory.createFoodType("Main meal");
        assertNotNull(foodtype);
        System.out.println(foodtype);

    }
}