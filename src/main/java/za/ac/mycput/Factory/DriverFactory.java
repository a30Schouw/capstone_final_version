/* DriverFactory.java
   Factory for the Driver
   @ author: Joshua Luke Retief (214234169)
   Date: 08 April 2022
 */

package za.ac.mycput.Factory;

import za.ac.mycput.Entity.Driver;

public class DriverFactory {
    public static Driver createDriver(String driverId,
                                      String driverFirstName,
                                      String driverLastName,
                                      String driverPhoneNumber)
    {
        Driver driver = new Driver.BuilderDriver()
                .setDriverId(driverId)
                .setDriverFirstName(driverFirstName)
                .setDriverLastName(driverLastName)
                .setDriverPhoneNumber(driverPhoneNumber)
                .build();

        return driver;

    }
}
