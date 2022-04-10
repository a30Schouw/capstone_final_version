/* DeliveryFactoryTest.java
   FactoryTest for the DeliveryFactoryTest
   @ author: Joshua Luke Retief (214234169)
   Date: 08 April 2022
 */

package za.ac.mycput.Factory;

import org.junit.Test;
import za.ac.mycput.Entity.Delivery;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DeliveryFactoryTest {
    @Test
    public void test(){
        Delivery delivery = new Delivery.BuilderDelivery()
                .setDeliveryId("94301285")
                .setDeliveryAddress("463 Crip Walk")
                .setDeliveryDate("8 April 2022")
                .build();
        System.out.println(delivery);
        assertNotNull(delivery);
    }
}