package za.ac.mycput.Entity;
/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 04 April 2022
*/
public class Customer {
    private String id;
    private String custFirstName;
    private String custLastName;
    private String custGender;
    private String custAddress;
    private long custPhoneNumber;
    public Customer() {

    }
    public Customer(Builder builder) {
        this.id = builder.custIdNumber;
        this.custFirstName = builder.custFirstName;
        this.custLastName = builder.custLastName;
        this.custGender = builder.custGender;
        this.custAddress = builder.custAddress;
        this.custPhoneNumber = builder.custPhoneNumber;
    }




    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        this.custFirstName = custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        this.custLastName = custLastName;
    }

    public String getCustGender() {
        return custGender;
    }

    public void setCustGender(String custGender) {
        this.custGender = custGender;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setDrAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustIdNumber() {
        return id;
    }

    public void setCustIdNumber(String custIdNumber) {
        this.id = custIdNumber;
    }

    public long getCustPhoneNumber() {
        return custPhoneNumber;
    }

    public void setCustPhoneNumber(long custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custFirstName='" + custFirstName + '\'' +
                ", custLastName='" + custLastName + '\'' +
                ", custGender='" + custGender + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custPhoneNumber=" + custPhoneNumber +
                '}';
    }

    public static class Builder {
        private String custFirstName;
        private String custLastName;
        private String custGender;
        private String custAddress;
        private String custIdNumber;
        private long custPhoneNumber;


        public Builder setCustFirstName(String custFirstName) {
            this.custFirstName = custFirstName;
            return this;
        }

        public Builder setCustLastName(String custLastName) {
            this.custLastName = custLastName;
            return this;
        }

        public Builder setCustGender(String custGender) {
            this.custGender = custGender;
            return this;
        }

        public Builder setCustAddress( String custAddress) {
            this.custAddress = custAddress;
            return this;
        }
        public Builder setCustIdNumber( String custIdNumber) {
            this.custIdNumber = custIdNumber;
            return this;
        }
        public Builder setCustPhoneNumber( long custPhoneNumber) {
            this.custPhoneNumber = custPhoneNumber;
            return this;
        }
        public Builder copy(Customer customer){
            this.custFirstName = customer.custFirstName;
            this.custLastName = customer.custLastName;
            this.custGender = customer.custGender;
            this.custAddress = customer.custAddress;
            this.custPhoneNumber = customer.custPhoneNumber;
            this.custIdNumber = customer.id;

            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }
}
