/*
 * Klaus Traubner
 * 218009496
 * 9 April 2022
 * Food Distributor Test Class
 *
 * */

package za.ac.mycput.Repository;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.mycput.Entity.FoodDistributor;
import za.ac.mycput.Factory.FoodDistributorFactory;
import za.ac.mycput.Repository.FoodDistributor.impl.FoodDistributorImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FoodDistributorRepoTest {

    private static FoodDistributorImpl repository = foodDistributor.getRepository();
    private static FoodDistributor foodDistributor = FoodDistributorFactory();

    @Test
    public void a_Create() {
        FoodDistributor create = repository.create(foodDistributor);
        assertEquals(foodDistributor.getName(), create.getName());
        System.out.println("Create : " + create);
    }

    @Test
    public void b_Read() {
        FoodDistributor create = repository.create(name1);
        FoodDistributor nameRead = repository.read(Create.getName());
        assertNotNull(create.getName);
        System.out.println("Read : " + nameRead);
    }

    @Test
    public void c_Update() {
        FoodDistributor Create = repository.create(foodDistributor);
        FoodDistributor nameUpdate = new FoodDistributor.Builder().copy(foodDistributor)
                .setAddress("Bottas Street")
                .build();
        foodDistributorUpdate = repository.update(foodDistributorUpdate);
        System.out.println("Old: " + foodDistributor);
        System.out.println("Updated Order Address :" + foodDistributorUpdate);
    }

    @Test
    public void d_Delete() {
        FoodDistributor Create = repository.create(foodDistributor);
        repository.delete(Create.getName());
        System.out.println("Deleted: " + Create.getName());
    }

    @Test
    public void e_GetAll() {
        System.out.println("Food Distributor: " + repository.getAll());
    }

}


