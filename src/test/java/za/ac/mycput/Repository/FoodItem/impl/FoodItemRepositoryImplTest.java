//package za.ac.mycput.Repository.FoodItem.impl;

/*FoodItemRepositoryImplTest.java
  Repository Test for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/
/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.Domain.FoodItem;
import za.ac.mycput.Factory.FoodItemFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)

class FoodItemRepositoryImplTest {
    private static FoodItemRepositoryImpl repository = FoodItemRepositoryImpl.getRepository();
    private static FoodItem foodI = FoodItemFactory.createFoodItem("Pizza002","Pizza",4,80,"Chicken and cheese");
    private static FoodItem food1 = FoodItemFactory.createFoodItem("Pizza002","Pizza",1,50,"Feta cheese and mushrooms");

    @Test
    void a_create() {
        FoodItem created = repository.create(foodI);
        assertEquals(foodI.getItemName(),created.getItemName());
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read() {

        FoodItem read = repository.read(foodI.getItemName());
        assertNotNull(read);
        System.out.println("Read:"+read);
    }

    @Test
    void c_update() {

        FoodItem updated = new FoodItem.Builder().copy(food1).setItemID("101").setItemName("Ice-cream")
                .setAmountOfItems(7)
                .setItemPrice(50)
                .setFoodType("Dessert")
                .build();
        assertNotNull(repository.updated(updated));
        System.out.println("Updated: "+ updated);

    }

    @Test
    void e_delete() {
        boolean deleted = repository.delete(foodI.getItemName());
        assertTrue(deleted);
        System.out.println("Deleted: "+ deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All:");
        System.out.println(repository.getAll());
    }
}*/