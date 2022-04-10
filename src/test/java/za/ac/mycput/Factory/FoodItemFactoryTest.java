package za.ac.mycput.Factory;

/*FoodItemFactoryTest.java
  Factory Test for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.FoodItem;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemFactoryTest {

    @Test
    void createFoodItem(){

        FoodItem fooditem = FoodItemFactory.createFoodItem("Burgers",3,50,"Meat");
        assertNotNull(fooditem);
        System.out.println(fooditem);

    }
}