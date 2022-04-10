/* Customer.java
 Factory for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 05 April 2022
*/

package za.ac.mycput.Factory;

import za.ac.mycput.Entity.Customer;

public class CustomerFactory {
public static Customer createCustomer( String id,String custFirstName, String custLastName,long custPhoneNumber, String custGender, String custAddress) {
 return new Customer.Builder().setCustIdNumber(id).setCustFirstName(custFirstName).setCustLastName(custLastName).setCustPhoneNumber(custPhoneNumber).setCustAddress(custAddress).setCustGender(custGender).build();

}
}
