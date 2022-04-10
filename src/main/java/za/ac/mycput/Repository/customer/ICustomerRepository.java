/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 07 April 2022
*/
package za.ac.mycput.Repository.customer;

import za.ac.mycput.Entity.Customer;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface ICustomerRepository  extends IRepository<Customer,String> {
   // Customer read(int customerId);

    public Set<Customer> getAll();
}
