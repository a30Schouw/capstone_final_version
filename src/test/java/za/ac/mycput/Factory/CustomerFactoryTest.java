package za.ac.mycput.Factory;

import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.Customer;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    @Test
    void createCustomer() {
        Customer customer = CustomerFactory.createCustomer("1","marco","mulondayi",727408325,"M","80 campground ");
        System.out.println(customer.toString());
        assertNotNull(customer);
    }
}