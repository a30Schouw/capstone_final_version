package za.ac.mycput.Repository.FoodItem.impl;

/*FoodItemRepositoryImplTest.java
  Repository for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.Entity.FoodItem;
import za.ac.mycput.Factory.FoodItemFactory;

@TestMethodOrder(MethodOrderer.MethodName.class)

class FoodItemRepositoryImplTest {
    private static FoodItemRepositoryImpl repository = FoodItemRepositoryImpl.getRepository();
    private static FoodItem foodI = FoodItemFactory.createFoodItem("Burger",4,80,"Meal");

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

        FoodItem updated = new FoodItem.Builder().copy(foodI).setItemName("Ice-cream")
                .setAmountOfItems(7)
                .setItemPrice(50)
                .setFoodType("Dessert")
                .build();
        assertNotNull(repository.update(updated));
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
}