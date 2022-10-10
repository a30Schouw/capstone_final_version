/*IDriverRepository.java
   Interface for the DriverRepositoryImpl
   Author: Joshua Retief (214234169)
   Date: 10 April 2022
 */

package za.ac.mycput.Repository.driver;

import za.ac.mycput.Entity.Driver;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IDriverRepository extends IRepository<Driver, String>
{
    public Set<Driver> getAllDriver();
}
