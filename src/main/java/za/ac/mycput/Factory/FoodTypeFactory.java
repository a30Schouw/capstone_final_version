package za.ac.mycput.Factory;

/*FoodTypeFactory.java
  Factory class for FoodType domain
  @author: Anicka Schouw 217284183
  Date: October 2022
*/

import za.ac.mycput.Domain.FoodType;

public class FoodTypeFactory {

    public static FoodType createFoodType(String foodName){
        return new FoodType.Builder().setFoodName(foodName).build();
    }

}
