/*
 * Klaus Traubner 218009496
 * 7 April 2022
 * OrderFactory.java
 * OrderFactory
 * */

package za.ac.mycput.Factory;
import za.ac.mycput.Entity.Order;

public class OrderFactory {

    public static Order buildOrder(int orderId,
                                   String orderAddress)

    {
        return new Order.Builder()
                .orderId(orderId)
                .orderAddress(orderAddress)
                .build();
    }

    public static Order.Builder copyFromOrder(Order order){
        return new Order.Builder().copy(order);
    }

}
