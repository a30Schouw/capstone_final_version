package za.ac.mycput.Controller.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.mycput.Domain.Customer;
import za.ac.mycput.Service.customer.impl.CustomerService;

import java.util.NoSuchElementException;
import java.util.Set;

@Slf4j
@RestController
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("customer/list")
    public ResponseEntity<Set<Customer>> list() {
        Set<Customer> customer = this.service.getAll();
        return ResponseEntity.ok(customer);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> get(@PathVariable int id) {
        try {
            Customer product = service.read(id);
            return new ResponseEntity<Customer>(product, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @PostMapping("/customer")
    public void add(@RequestBody Customer customer) {
        service.save(customer);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id) {
        try {
            Customer existProduct = service.read(id);
            service.save(customer);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }
}