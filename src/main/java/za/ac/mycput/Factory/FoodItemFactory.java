package za.ac.mycput.Factory;
/*
FoodItemFactory.java
Factory class for domain class FoodItem
@author: Anicka Schouw 217284183
Date: October 2022
 */
import za.ac.mycput.Domain.FoodItem;

public class FoodItemFactory {
    public static FoodItem createFoodItem(String itemID, String itemName, int amountOfItems, int itemPrice, String foodType){
        return new FoodItem.Builder().setItemID(itemID)
                .setItemName(itemName)
                .setAmountOfItems(amountOfItems)
                .setItemPrice(itemPrice)
                .setFoodType(foodType)
                .build();
    }
}
