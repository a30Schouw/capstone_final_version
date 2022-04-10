/*
 * Klaus Traubner 218009496
 * 9 April 2022
 * Food Distributor Impl
 * */

package za.ac.mycput.Repository.FoodDistributor.impl;

import za.ac.mycput.Entity.FoodDistributor;
import za.ac.mycput.Repository.FoodDistributor.IFoodDistributorRepository;
import java.util.*;
import java.util.Set;
@Deprecated
public class FoodDistributorImpl implements IFoodDistributorRepository {

    private static FoodDistributorImpl repository = null;
    private Set <FoodDistributor> foodDistributorDB;

    public FoodDistributorImpl() {
        foodDistributorDB = new HashSet<FoodDistributor>();
    }

    public static FoodDistributorImpl getRepository() {
        if (repository == null) {
            repository = new FoodDistributorImpl();
        }
        return repository;
    }

    @Override
    public FoodDistributor create(FoodDistributor foodDistributor) {
        boolean success = foodDistributorDB.add(foodDistributor);
        if (!success) return null;
        return foodDistributor;
    }

    @Override
    public FoodDistributor read (String Name) {
        for (FoodDistributor n: foodDistributorDB) {
            if (n.getName() == Name)
            //if (n.getName().equals(Name);
                return n;
        }
        return null;
    }

    @Override
    public FoodDistributor update(FoodDistributor foodDistributor) {
        FoodDistributor oldFoodDistributor = read(foodDistributor.getName());
        if(oldFoodDistributor != null){
            foodDistributorDB.remove(oldFoodDistributor);
            foodDistributorDB.add(foodDistributor);
            return foodDistributor;
        }
        return null;
    }

    @Override
    public boolean delete (String name) {
        FoodDistributor foodDistributorToDelete = read(name);
        if (foodDistributorToDelete == null)
            return false;
        foodDistributorDB.remove(name);

        return true;
    }

    @Override
    public Set<FoodDistributor> getAll() {
        return foodDistributorDB;
    }

}
