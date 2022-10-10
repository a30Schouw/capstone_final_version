/* DeliveryFactory.java
   Factory for the Delivery
   @ author: Joshua Luke Retief (214234169)
   Date: 08 April 2022
 */

package za.ac.mycput.Factory;

import za.ac.mycput.Entity.Delivery;

public class DeliveryFactory {
    public static Delivery createDelivery(String deliveryId,
                                          String deliveryAddress,
                                          String deliveryDate)
    {
        Delivery delivery = new Delivery.BuilderDelivery()
                .setDeliveryId(deliveryId)
                .setDeliveryAddress(deliveryAddress)
                .setDeliveryDate(deliveryDate)
                .build();

        return delivery;
    }
}
