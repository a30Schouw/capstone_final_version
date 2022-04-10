
/* Customer.java
 Entity for the Customer
 Author: Marco Mulondayi Tshimanga (219049505)
 Date: 04 April 2022
*/package za.ac.mycput.Factory;
import za.ac.mycput.Entity.SalesReport;

public class SalesReportFactory {
    public static SalesReport createProductReport(int id, String date, double total, int quantity, int itemSoldId) {
        return new SalesReport.Builder().setId(id).setDate(date).setTotal(total).setItemSoldId(itemSoldId).build();
    }
}