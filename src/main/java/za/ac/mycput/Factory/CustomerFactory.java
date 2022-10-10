/* Customer.java
 Factory for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 05 April 2022
*/

package za.ac.mycput.Factory;

import za.ac.mycput.Domain.Customer;

public class CustomerFactory {
public static Customer createCustomer( int id,String custFirstName, String custLastName,String custPhoneNumber, String custGender, String custAddress) {
 return new Customer.Builder().setCustomerId(id).setCustomerFirstName(custFirstName).setCustomerLastName(custLastName).setCustomerPhoneNumber(custPhoneNumber).setCustomerAddress(custAddress).setCustomerGender(custGender).build();

}
}
