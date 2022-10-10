/*
 * Klaus Traubner 218009496
 * 9 April 2022
 * OrderRepositoryImpl.java class
 *
 * */

package za.ac.mycput.Repository.Order.impl;

import za.ac.mycput.Entity.Order;
import za.ac.mycput.Repository.Order.IOrderRepository;

import java.util.Set;
@Deprecated
public abstract class OrderRepositoryImpl implements IOrderRepository {

    private static OrderRepositoryImpl repository = null;
    private Set<Order> orderDB;

    public static OrderRepositoryImpl getRepository() {
        if(repository == null){
            repository = new OrderRepositoryImpl() {
                @Override
                public Order read(String s) {
                    return null;
                }

                @Override
                public boolean delete(String s) {
                    return false;
                }
            };
        }
        return repository;
    }

    @Override
    public Order create (Order order) {
        boolean success = orderDB.add(order);
        if(!success) return null;
        return order;
    }

    @Override
    public Order read(Integer orderId) {
        for (Order o: orderDB){
            if (o.getOrderId() == orderId)
                return o;
        }
        return null;
    }

    @Override
    public Order update (Order order) {
        Order order1 = read(order.getOrderId());
        if(order1 != null) {
            orderDB.remove(order1);
            orderDB.add(order);
            return order;
        }

        return null;
    }

    @Override
    public boolean delete (Integer orderId) {
        Order orderToDelete = read(orderId);
        if (orderToDelete == null)
            return false;
        orderDB.remove(orderId);

        return true;
    }

    @Override
    public Set<Order> getAll() {
        return orderDB;
    }

}
