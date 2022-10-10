package za.ac.mycput.Entity;

/*FoodItem.java
 Entity for FoodItem
 @author: Anicka Schouw 217284183
 Date: April 2022
 */

public class FoodItem {

    private String itemName;
    private int amountOfItems;
    private double itemPrice;
    private String foodType;

    private FoodItem(){

    }

    private FoodItem(Builder builder){
        this.itemName = builder.itemName;
        this.amountOfItems = builder.amountOfItems;
        this.itemPrice = builder.itemPrice;
        this.foodType = builder.foodType;
    }

    public String getItemName() {
        return itemName;
    }

    public int getAmountOfItems() {
        return amountOfItems;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "itemName='" + itemName + '\'' +
                ", amountOfItems=" + amountOfItems +
                ", itemPrice=" + itemPrice +
                ", foodType='" + foodType + '\'' +
                '}';
    }

    public static class Builder{
        private String itemName;
        private int amountOfItems;
        private double itemPrice;
        private String foodType;

        public Builder setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public Builder setAmountOfItems(int amountOfItems) {
            this.amountOfItems = amountOfItems;
            return this;
        }

        public Builder setItemPrice(double itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        public Builder setFoodType(String foodType) {
            this.foodType = foodType;
            return this;
        }

        public Builder copy(FoodItem fooditem){
            this.itemName = fooditem.itemName;
            this.amountOfItems = fooditem.amountOfItems;
            this.itemPrice = fooditem.itemPrice;
            this.foodType = fooditem.foodType;
            return this;
        }
        public FoodItem build(){
            return new FoodItem(this);
        }
    }
}

