/*
* Klaus Traubner
* 218009496
* 9 April 2022
*  OrderFactory Test
* */

package za.ac.mycput.Factory;

import org.junit.Test;
import za.ac.mycput.Entity.Order;

import static org.junit.Assert.assertNotNull;

public class OrderFactoryTest {

    @Test
    public void test() {
        Order order = OrderFactory.buildOrder(2846, "Shop 403, Canal Walk, Century Boulevard, Milnerton");
        System.out.println(order.toString());
        assertNotNull(order);
    }

}
