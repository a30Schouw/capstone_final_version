package za.ac.mycput.Factory;

/*FoodTypeFactory.java
        Factory for FoodType
        Author: Anicka Schouw 217284183
        Date: April 2022
*/

import za.ac.mycput.Entity.FoodType;

public class FoodTypeFactory {

    public static FoodType createFoodType(String foodName){
        FoodType foodType = new FoodType.Builder().setFoodName(foodName).build();
        return foodType;
    }

}
