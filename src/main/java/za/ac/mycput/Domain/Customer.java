package za.ac.mycput.Domain;

import javax.validation.constraints.NotNull;

import javax.persistence.*;

/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 05 April 2022
*/
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  customerId;
    @NotNull
    private String customerFirstName;
    @NotNull
    private String customerLastName;
    @NotNull
    private String customerGender;
    @NotNull
    private String customerAddress;
    @NotNull
    private String customerPhoneNumber;



    public Customer() {

    }
    public Customer(Builder builder) {
        this.customerId = builder.customerId;
        this.customerFirstName = builder.customerFirstName;
        this.customerLastName = builder.customerLastName;
        this.customerGender = builder.customerGender;
        this.customerAddress = builder.customerAddress;
        this.customerPhoneNumber = builder.customerPhoneNumber;
    }




    public String getCustomerFirstName() {
        return customerFirstName;
    }


    public String getCustomerLastName() {
        return customerLastName;
    }


    public String getCustomerGender() {
        return customerGender;
    }


    public String getCustomerAddress() {
        return customerAddress;
    }


    public int getCustomerId() {
        return customerId;
    }


    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + customerId +
                ", custFirstName='" + customerFirstName + '\'' +
                ", custLastName='" + customerLastName + '\'' +
                ", custGender='" + customerGender + '\'' +
                ", custAddress='" + customerAddress + '\'' +
                ", custPhoneNumber=" + customerPhoneNumber +
                '}';
    }

    public static class Builder {
        private String customerFirstName;
        private String customerLastName;
        private String customerGender;
        private String customerAddress;
        private int customerId;
        private String customerPhoneNumber;


        public Builder setCustomerFirstName(String customerFirstName) {
            this.customerFirstName = customerFirstName;
            return this;
        }

        public Builder setCustomerLastName(String custLastName) {
            this.customerLastName = custLastName;
            return this;
        }

        public Builder setCustomerGender(String customerGender) {
            this.customerGender = customerGender;
            return this;
        }

        public Builder setCustomerAddress( String customerAddress) {
            this.customerAddress = customerAddress;
            return this;
        }
        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }
        public Builder setCustomerPhoneNumber( String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
            return this;
        }
        public Builder copy(Customer customer){
            this.customerFirstName = customer.customerFirstName;
            this.customerLastName = customer.customerLastName;
            this.customerGender = customer.customerGender;
            this.customerAddress = customer.customerAddress;
            this.customerPhoneNumber = customer.customerPhoneNumber;
            this.customerId = customer.customerId;

            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
