/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 05 April 2022
*/
package za.ac.mycput.Factory;

/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 05 April 2022
*/
import org.junit.jupiter.api.Test;

import za.ac.mycput.Entity.SalesReport;

import static org.junit.Assert.assertNotNull;

class SalesReportFactoryTest {

    @Test
    void createProductReport() {
        SalesReport salesReport = SalesReportFactory.createProductReport(1,"12/01/2023",80.6,50,1678);
        System.out.println(salesReport.toString());
        assertNotNull(salesReport );
    }
}