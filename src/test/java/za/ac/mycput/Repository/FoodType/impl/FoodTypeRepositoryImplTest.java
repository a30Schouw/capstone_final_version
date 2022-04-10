package za.ac.mycput.Repository.FoodType.impl;

/*FoodTypeRepositoryImplTest.java
  Repository Test for FoodItem
  Author: Anicka Schouw 217284183
  Date: April 2022
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.Entity.FoodType;
import za.ac.mycput.Factory.FoodTypeFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)

class FoodTypeRepositoryImplTest {
    private static FoodTypeRepositoryImpl repo = FoodTypeRepositoryImpl.getRepository();
    private static FoodType foodT = FoodTypeFactory.createFoodType("Dessert");

    @Test
    void a_create() {
        FoodType created = repo.create(foodT);
        assertEquals(foodT.getFoodName(),created.getFoodName());
        System.out.println("Created: "+ created);
    }

    @Test
    void b_read() {

        FoodType read = repo.read(foodT.getFoodName());
        assertNotNull(read);
        System.out.println("Read:"+read);
    }

    @Test
    void c_update() {

        FoodType updated = new FoodType.Builder().copy(foodT).setFoodName("Ice-cream")
                .build();
        assertNotNull(repo.update(updated));
        System.out.println("Updated: "+ updated);

    }

    @Test
    void e_delete() {
        boolean deleted = repo.delete(foodT.getFoodName());
        assertTrue(deleted);
        System.out.println("Deleted: "+ deleted);
    }

    @Test
    void d_getAll() {
        System.out.println("Show All:");
        System.out.println(repo.getAll());
    }
}