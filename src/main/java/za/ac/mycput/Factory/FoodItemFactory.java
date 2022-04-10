package za.ac.mycput.Factory;

/*FoodItemFactory.java
        Factory for FoodItem
        Author: Anicka Schouw 217284183
        Date: April 2022
*/
import za.ac.mycput.Entity.FoodItem;

public class FoodItemFactory {

    public static FoodItem createFoodItem(String itemName, int amountOfItems, double itemPrice, String foodType){
        FoodItem foodItem = new FoodItem.Builder().setItemName(itemName)
                .setAmountOfItems(amountOfItems)
                .setItemPrice(itemPrice)
                .setFoodType(foodType)
                .build();
        return foodItem;
    }

}