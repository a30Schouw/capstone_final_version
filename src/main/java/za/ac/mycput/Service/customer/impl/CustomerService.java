package za.ac.mycput.Service.customer.impl;
import org.springframework.stereotype.Service;
import za.ac.mycput.Domain.Customer;
import za.ac.mycput.Repository.customer.CustomerRepository;
import za.ac.mycput.Service.customer.ICustomerService;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomerService  implements ICustomerService {

    private final CustomerRepository repository;
    public CustomerService(CustomerRepository repository)
    {
        this.repository = repository;
    }
    @Override
    public Customer save(Customer customer)
    {
        return this.repository.save(customer);

    }
    @Override
    public Customer read(Integer id) {
      return repository.findById(id).get();
    }

    @Override
    public Customer update(Customer customer)
    {
       return  save(customer);
    }

    @Override
    public void delete(Integer id) {
     repository.deleteById(id);

    }

    @Override
    public Set<Customer> getAll()
    {
        return this.repository.findAll().stream().collect(Collectors.toSet());

    }


}
