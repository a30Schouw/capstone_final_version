package za.ac.mycput.Factory;
import za.ac.mycput.Entity.ProductReport;

public class ProductReportFactory {
    public static ProductReport createProductReport(int id, String date, double total, int quantity, int itemSoldId) {
        return new ProductReport.Builder().setId(id).setDate(date).setTotal(total).setItemSoldId(itemSoldId).build();
    }
}