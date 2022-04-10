/*
 * Klaus Traubner 218009496
 * 7 April 2022
 * FoodDistributor.java
 * FoodDistributor factory
 * */

package za.ac.mycput.Factory;
import za.ac.mycput.Entity.FoodDistributor;

public class FoodDistributorFactory {

    public static FoodDistributor buildFoodDistributor (String Name,
                                                        String Address,
                                                        long distributorNo)
    {
        return new FoodDistributor.Builder()
                .Name(Name)
                .Address(Address)
                .distributorNo(distributorNo)
                .build();
    }

    public static FoodDistributor.Builder copyFromFoodDistributor(FoodDistributor foodDistributor){
        return new FoodDistributor.Builder().copy(foodDistributor);
    }


}
