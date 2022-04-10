package za.ac.mycput.Repository.SalesReport;

import za.ac.mycput.Entity.Customer;
import za.ac.mycput.Entity.SalesReport;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface ISalesreportRepository  extends IRepository<SalesReport,Integer> {
    public Set<SalesReport> getAll();
}
