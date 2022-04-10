/* DriverFactoryTest.java
   FactoryTest for the DriverFactoryTest
   @ author: Joshua Luke Retief (214234169)
   Date: 08 April 2022
 */

package za.ac.mycput.Factory;

import org.junit.Test;
import za.ac.mycput.Entity.Driver;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DriverFactoryTest {
    @Test
    public void test(){
        Driver driver = DriverFactory.createDriver("214234169", "Joshua","Retief",
                "064 683 0785");
        System.out.println(driver.toString());
        assertNotNull(driver);
    }


}