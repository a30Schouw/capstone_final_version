package za.ac.mycput.Service.foodItem;
/*
FoodItemServiceTest.java
Test Service case for FoodItem Domain
@author: Anicka Schouw 217284183
Date: October 2022
 */

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.mycput.Domain.FoodItem;
import za.ac.mycput.Factory.FoodItemFactory;
import za.ac.mycput.FoodManagementSystemApplication;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@SpringBootTest(classes= FoodManagementSystemApplication.class)
class FoodItemServiceTest
{
    private final FoodItem foodItem = FoodItemFactory.createFoodItem("200","Chicken Wings",1,80,"Starter");
    private FoodItem itemSaved;
    @Autowired
    private FoodItemService itemService;

    void createFoodItem(FoodItem foodItem1)
    {
        itemSaved =  itemService.save(foodItem1);
    }


    @Test
    public void a_save()
    {
        createFoodItem(foodItem);
        assertEquals("200",itemSaved.getItemID());
        System.out.println(itemSaved);
    }

    @Test
    public void b_read()
    {
        createFoodItem(foodItem);
        FoodItem read=itemService.read(itemSaved.getItemID());
        System.out.println("Read: "+ read);
    }

    @Test
    public void c_update()
    {
        createFoodItem(foodItem);
        FoodItem foodItem2 = new FoodItem.Builder()
                .copy(foodItem)
                .setItemName("Chicken Strips")
                .build();
        itemService.update(foodItem2);
        System.out.println("updated" + foodItem2);
    }

    @Test
    public void e_delete()
    {
        createFoodItem(foodItem);
        boolean delete=itemService.delete(itemSaved.getItemID());
        assertTrue(delete);
        System.out.println("Successfully deleted:"+delete);
    }

    @Test
    public void d_getAll()
    {
        Set<FoodItem> foodItemSet= itemService.getAll();
        System.out.println(foodItemSet);
    }

}