/*
 * Klaus Traubner
 * 218009496
 * 9 April 2022
 *  Food Distributor Test
 * */

package za.ac.mycput.Factory;

import org.junit.Test;
import za.ac.mycput.Entity.FoodDistributor;

import static org.junit.jupiter.api.Assertions.*;

public class FoodDistributorFactoryTest {
    @Test

    public void test(){
        FoodDistributor foodDistributor = FoodDistributorFactory.buildFoodDistributor("Mustek","45 Rosebank Avenue, Cape Town", 87864);
        System.out.println(foodDistributor.toString());
        assertNotNull(foodDistributor);
    }

}
