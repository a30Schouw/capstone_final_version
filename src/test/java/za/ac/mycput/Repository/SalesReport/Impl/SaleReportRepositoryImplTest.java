
package za.ac.mycput.Repository.SalesReport.Impl;

import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.SalesReport;
import za.ac.mycput.Factory.SalesReportFactory;

import static org.junit.jupiter.api.Assertions.*;

class SaleReportRepositoryImplTest {

    private static SaleReportRepositoryImpl repository= SaleReportRepositoryImpl.getRepository();
    private  static SalesReport saleReport= SalesReportFactory.createProductReport(1,"12/01/2023",80.6,50,1678);

    @Test
    void create() {
        SalesReport created =repository.create(saleReport);
        assertEquals(saleReport.getId(),created.getId());
        System.out.println("created"+created);
    }

    @Test
    void read() {
        SalesReport read = repository.read(saleReport.getId());
        System.out.println("read "+ read);
    }

    @Test
    void update() {
        SalesReport updated =new SalesReport.Builder().copy(saleReport).setId(1).setDate("16/01/1998").setItemSoldId(3).setTotal(89.00).setQuantity(90).build();
        System.out.println("updated"+updated);
    }

    @Test
    void delete() {
        boolean success = repository.delete(saleReport.getId());
        System.out.println("deleted"+success);

    }
    @Test
    void getAll() {
        System.out.println("show all");
        System.out.println(repository.getAll());

    }
}