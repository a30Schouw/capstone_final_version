/*
 * FoodDistributor.java
 * Klaus Traubner 218009496
 * 6 April 2022
 * Food distributor entity
 * */

package za.ac.mycput.Entity;

public class FoodDistributor {

    private String Name;
    private String Address;
    private long distributorNo;

    private FoodDistributor() {
    }

    private FoodDistributor(Builder builder) {
        this.Name = builder.Name;
        this.Address = builder.Address;
        this.distributorNo = builder.distributorNo;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public long getDistributorNo() {
        return distributorNo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setDistributorNo(long distributorNo) {
        this.distributorNo = distributorNo;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", distributorNo='" + distributorNo + '\'';
    }

    public static class Builder {
        private String Name, Address;
        private long distributorNo;

        public Builder distributorNo(long distributorNo) {
            this.distributorNo = distributorNo;
            return this;
        }

        public Builder Address (String Address){
            this.Address = Address;
            return this;
        }

        public Builder Name (String Name) {
            this.Name = Name;
            return this;
        }
        public FoodDistributor build() {
            return new FoodDistributor(this);
        }

        public Builder copy (FoodDistributor foodDistributor) {
            this.Name = foodDistributor.Name;
            this.Address = foodDistributor.Address;
            this.distributorNo = foodDistributor.distributorNo;
            return this;
        }
    }

}

