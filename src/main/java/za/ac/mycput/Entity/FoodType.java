package za.ac.mycput.Entity;

/*FoodType.java
 Entity for FoodType
 @author: Anicka Schouw 217284183
 Date: April 2022
 */

public class FoodType {
    private String foodName;

    private FoodType(){

    }

    private FoodType(Builder builder){
        this.foodName = builder.foodName;

    }

    public String getFoodName() {
        return foodName;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "foodName='" + foodName + '\'' +
                '}';
    }

    public static class Builder{
        private String foodName;

        public Builder setFoodName(String foodName) {
            this.foodName = foodName;
            return this;
        }

        public Builder copy(FoodType foodtype){
            this.foodName = foodtype.foodName;
            return this;
        }

        public FoodType build(){
            return new FoodType(this);
        }
    }
}

