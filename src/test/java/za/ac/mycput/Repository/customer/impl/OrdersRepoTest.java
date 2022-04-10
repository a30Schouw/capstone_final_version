/*
 * Klaus Traubner
 * 218009496
 * 9 April 2022
 * Orders Repository Test Class
 *
 * */

package za.ac.mycput.Repository;

import org.junit.*;
import org.junit.runners.MethodSorters;
import za.ac.mycput.Entity.Order;
import za.ac.mycput.Repository.Order.impl.OrderRepositoryImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class OrdersRepoTest {

    private static OrderRepositoryImpl repository = OrderRepository.getRepository();
    private static Order order = OrderFactory();

    @Test
    public void a_Create() {
        Order create = repository.create(order);
        assertEquals(order.getOrderId(), create.getOrderId());
        System.out.println("Create : " + create);
    }

    @Test
    public void b_Read() {
        Order create = repository.create(order2);
        Order orderRead = repository.read(Create.getOrderId());
        assertNotNull(Create.getOrderId);
        System.out.println("Read : " + orderRead);
    }

    @Test
    public void c_Update() {
        Order Create = repository.create(order);
        Order orderUpdate = new Order.Builder().copy(order)
                .setOrderAddress("Aston Martin Road")
                .build();
        orderUpdate = repository.update(orderUpdate);
        System.out.println("Old: " + order);
        System.out.println("Updated Order Address :" + orderUpdate);
    }

    @Test
    public void d_Delete() {
        Order Create = repository.create(order);
        repository.delete(Create.getOrderId());
        System.out.println("Deleted: " + Create.getOrderId());
    }

    @Test
    public void e_GetAll() {
        System.out.println("Orders: " + repository.getAll());
    }

}


