/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 07 April 2022
*/
package za.ac.mycput.Repository.customer.impl;

import za.ac.mycput.Entity.Customer;
import za.ac.mycput.Repository.customer.ICustomerRepository;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private static CustomerRepositoryImpl repository=null;
    private Set<Customer> customerDB ;

    public CustomerRepositoryImpl() {
        customerDB = new HashSet<Customer>();

    }

    public static CustomerRepositoryImpl getRepository() {
        if(repository == null){
            repository = new CustomerRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Customer create(Customer customer) {
       boolean success =customerDB.add(customer);
       if(!success)
           return null;
        return customer;
    }

    @Override
    public Customer read(String customerId) {
//        for (Customer c:customerDB){
//            if (c.getCustIdNumber()== customerId){
//                return c;}
//        }
//        return null;

        Customer customer= customerDB.stream().filter(c-> c.getCustIdNumber().equals(customerId)).findAny().orElse(null);
        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer oldCustomer =read(customer.getCustIdNumber());
        if(oldCustomer != null){
            customerDB.remove(oldCustomer);
            customerDB.add(customer);
            return customer;
        }
        return null;
    }

    @Override
    public boolean delete(String customerId) {
        Customer customerToDelete =read(customerId);
        if (customerToDelete == null)
            return false;
          customerDB.remove(customerId);

        return true;
    }

    @Override
    public Set<Customer> getAll() {
        return customerDB;
    }
}
