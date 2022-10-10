/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 07 April 2022
*/
package za.ac.mycput.Repository.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.mycput.Domain.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
