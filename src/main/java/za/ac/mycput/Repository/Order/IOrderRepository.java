/*
 * Klaus Traubner 218009496
 * 9 April 2022
 * IOrderRepository
 * IOrderRepository Interface
 * */

package za.ac.mycput.Repository.Order;

import za.ac.mycput.Entity.Order;
import za.ac.mycput.Repository.IRepository;
import java.util.Set;

public interface IOrderRepository extends IRepository <Order, String> {

    Order read(Integer orderId);

    boolean delete(Integer orderId);

    Set <Order> getAll();

}
