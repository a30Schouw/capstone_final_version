/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 05 April 2022
*/

package za.ac.mycput.Repository.customer.impl;

import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.Customer;
import za.ac.mycput.Factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRepositoryImplTest {
    private static CustomerRepositoryImpl repository= CustomerRepositoryImpl.getRepository();
    private  static Customer customer = CustomerFactory.createCustomer("1","marco","mulondayi",727408325,"M","80 campground ");

    @Test
    void create() {
        Customer created =repository.create(customer);
        assertEquals(customer.getCustIdNumber(),created.getCustIdNumber());
        System.out.println("created"+created);
    }

    @Test
    void read() {
        Customer read = repository.read(customer.getCustIdNumber());
        System.out.println("read "+ read);
    }

    @Test
    void update() {
        Customer updated =new Customer.Builder().copy(customer).setCustIdNumber("1").setCustFirstName("marco").setCustLastName("mulonday").setCustAddress("80 camp").setCustPhoneNumber(727408325).setCustGender("m").build();
        System.out.println("updated"+updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(customer.getCustIdNumber());
        System.out.println("deleted"+success);

    }
    @Test
    void getAll() {
        System.out.println("show all");
        System.out.println(repository.getAll());

    }
}