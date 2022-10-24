package za.ac.mycput.Factory;
/*FoodItemFactoryTest.java
  Factory Test case for domain class FoodItem
  @author: Anicka Schouw 217284183
  Date: October 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.mycput.Domain.FoodItem;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemFactoryTest {

    @Test
    void createFoodItem(){

        FoodItem fooditem = FoodItemFactory.createFoodItem("Burgers001","Burgers",3,150,"Chicken");
        assertNotNull(fooditem);
        System.out.println(fooditem);

    }
}