package za.ac.mycput.Domain;
/*
FoodItem.java
Entity class for FoodItem
@author: Anicka Schouw 217284183
Date: October 2022
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "food_item")
public class FoodItem implements Serializable
{
    @Id
    @Column(name = "item_id")
    private String itemID;
    @NotNull
    private String itemName,foodType;
    private int amountOfItems,itemPrice;

    protected FoodItem(){}

    private FoodItem(Builder builder)
    {
        this.itemID = builder.itemID;
        this.itemName = builder.itemName;
        this.amountOfItems = builder.amountOfItems;
        this.itemPrice = builder.itemPrice;
        this.foodType = builder.foodType;
    }

    public String getItemID() {
        return itemID;
    }
    public String getItemName() {
        return itemName;
    }

    public int getAmountOfItems() {
        return amountOfItems;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "itemID='" + itemID + '\'' +
                ", itemName='" + itemName + '\'' +
                ", amountOfItems='" + amountOfItems + '\'' +
                ", itemPrice='" + itemPrice + '\'' +
                ", foodType='" + foodType + '\'' +
                '}';
    }

    public static class Builder{
        private String itemID;
        private String itemName,foodType;

        private int amountOfItems, itemPrice;


        public Builder setItemID(String itemID) {
            this.itemID = itemID;
            return this;
        }


        public Builder setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public Builder setAmountOfItems(int amountOfItems) {
            this.amountOfItems = amountOfItems;
            return this;
        }

        public Builder setItemPrice(int itemPrice) {
            this.itemPrice = itemPrice;
            return this;
        }

        public Builder setFoodType(String foodType) {
            this.foodType = foodType;
            return this;
        }

        public Builder copy(FoodItem fooditem){
            this.itemID = fooditem.itemID;
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

