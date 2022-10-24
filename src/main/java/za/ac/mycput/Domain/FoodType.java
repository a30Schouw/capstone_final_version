package za.ac.mycput.Domain;
/*
FoodType.java
Domain class for entity FoodType
@author: Anicka Schouw 217284183
Date: October 2022
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "food_type")
public class FoodType implements Serializable
{
    @Id
    @Column(name = "food_name")
    private String foodName;

    protected FoodType(){}

    private FoodType(Builder builder)
    {
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

        public Builder copy(FoodType foodType){
            this.foodName = foodType.foodName;
            return this;
        }
        public FoodType build(){
            return new FoodType(this);
        }
    }
}

