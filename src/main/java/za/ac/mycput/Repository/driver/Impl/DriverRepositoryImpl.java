/*DriverRepositoryImpl.java
   Class for the DriverRepositoryImpl
   Author: Joshua Retief (214234169)
   Date: 10 April 2022
 */

package za.ac.mycput.Repository.driver.Impl;

import za.ac.mycput.Entity.Driver;
import za.ac.mycput.Repository.driver.IDriverRepository;

import java.util.HashSet;
import java.util.Set;

public class DriverRepositoryImpl implements IDriverRepository
{
    public static DriverRepositoryImpl repository = null;
    public Set<Driver> driverDB = null;

    private DriverRepositoryImpl(){
        driverDB = new HashSet<Driver>();
    }

    public static DriverRepositoryImpl getRepository(){
        if (repository == null)
        {
            repository = new DriverRepositoryImpl();

        }
        return repository;
    }

    @Override
    public Driver create(Driver driver) {
        boolean success = driverDB.add(driver);
        if(!success)
            return null;
        return driver;
    }

    @Override
    public Driver read(String driverId) {
        for (Driver driver : driverDB){
            if (driver.getDriverId().equals(driverId))
                return driver;

        }
        return null;
    }

    @Override
    public Driver update(Driver driver) {
        Driver oldDriver = read(driver.getDriverId());
        if (oldDriver != null)
        {
            driverDB.remove(oldDriver);
            driverDB.add(driver);
            return driver;
        }
        return null;
    }

    @Override
    public boolean delete(String driverId) {
        Driver driverToDelete = read(driverId);
        if(driverToDelete == null)
            return false;
        driverDB.remove(driverToDelete);
        return true;
    }

    @Override
    public Set<Driver> getAllDriver() {
        return driverDB;
    }
}
