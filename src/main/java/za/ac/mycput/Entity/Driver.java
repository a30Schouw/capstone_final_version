/* Driver.java
   Entity for the Driver
   @ author: Joshua Luke Retief (214234169)
   Date: 06 April 2022
 */

package za.ac.mycput.Entity;

public class Driver {
    public String driverId;
    public String driverFirstName;
    public String driverLastName;
    public String driverPhoneNumber;

    public Driver(){}

    public Driver(BuilderDriver builder){
        this.driverId = builder.driverId;
        this.driverFirstName = builder.driverFirstName;
        this.driverLastName = builder.driverLastName;
        this.driverPhoneNumber = builder.driverPhoneNumber;
    }

    //Getters
    public String getDriverId() {return driverId; }

    public String getDriverFirstName() {
        return driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }

    public String getDriverPhoneNumber() {
        return driverPhoneNumber;
    }

    //Setters
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public void setDriverPhoneNumber(String driverPhoneNumber) {
        this.driverPhoneNumber = driverPhoneNumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverId=" + driverId +
                ", driverFirstName='" + driverFirstName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", driverPhoneNumber='" + driverPhoneNumber + '\'' +
                '}';
    }

    public static class BuilderDriver{
        public String driverId;
        public String driverFirstName;
        public String driverLastName;
        public String driverPhoneNumber;

        public BuilderDriver setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }

        public BuilderDriver setDriverFirstName(String driverFirstName) {
            this.driverFirstName = driverFirstName;
            return this;
        }

        public BuilderDriver setDriverLastName(String driverLastName) {
            this.driverLastName = driverLastName;
            return this;
        }

        public BuilderDriver setDriverPhoneNumber(String driverPhoneNumber) {
            this.driverPhoneNumber = driverPhoneNumber;
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }

        public BuilderDriver copy(Driver driver){
            this.driverId = driver.driverId;
            this.driverFirstName = driver.driverFirstName;
            this.driverLastName = driver.driverLastName;
            this.driverPhoneNumber = driver.driverPhoneNumber;

            return this;
        }
    }
}
