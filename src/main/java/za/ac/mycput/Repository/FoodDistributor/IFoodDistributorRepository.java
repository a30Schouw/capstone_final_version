/*
* Klaus Traubner 218009496
* 9 April 2022
* Food Distributor Interface
* */

package za.ac.mycput.Repository.FoodDistributor;

import za.ac.mycput.Entity.FoodDistributor;
import za.ac.mycput.Repository.IRepository;
import java.util.Set;

public interface IFoodDistributorRepository extends IRepository <FoodDistributor, String> {
    public Set <FoodDistributor> getAll();

}