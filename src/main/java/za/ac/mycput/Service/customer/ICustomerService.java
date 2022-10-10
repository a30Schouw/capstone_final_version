package za.ac.mycput.Service.customer;
import za.ac.mycput.Domain.Customer;
import za.ac.mycput.Service.IService;

import java.util.Set;

public interface ICustomerService extends IService<Customer,Integer> {
        Set<Customer> getAll();
        }