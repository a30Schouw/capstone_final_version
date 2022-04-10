package za.ac.mycput.Repository.SalesReport.Impl;



import za.ac.mycput.Entity.Customer;
import za.ac.mycput.Entity.SalesReport;
import za.ac.mycput.Repository.SalesReport.ISalesreportRepository;
import za.ac.mycput.Repository.customer.ICustomerRepository;
import za.ac.mycput.Repository.customer.impl.CustomerRepositoryImpl;

import java.util.HashSet;
import java.util.Set;

public class SaleReportRepositoryImpl implements ISalesreportRepository {
    private static SaleReportRepositoryImpl  repository=null;
    private Set<SalesReport> salesReportDB ;

    public SaleReportRepositoryImpl () {
        salesReportDB= new HashSet<SalesReport>();

    }

    public static SaleReportRepositoryImpl getRepository() {
        if(repository == null){
            repository = new SaleReportRepositoryImpl();
        }
        return repository;
    }

    @Override
    public SalesReport create(SalesReport salesReport) {
        boolean success =salesReportDB.add(salesReport);
        if(!success)
            return null;
        return salesReport;
    }

    @Override
    public SalesReport read(Integer id) {
//        for (Customer c:customerDB){
//            if (c.getCustIdNumber()== customerId){
//                return c;}
//        }
//        return null;

        SalesReport salesReport = salesReportDB.stream().filter(c-> c.getId()==(id)).findAny().orElse(null);
        return salesReport;
    }

    @Override
    public SalesReport update(SalesReport salesReport) {
        SalesReport OldSalesReport =read(salesReport.getId());
        if(OldSalesReport != null){
            salesReportDB.remove(OldSalesReport);
            salesReportDB.add(salesReport);
            return salesReport;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        SalesReport customerToDelete =read(id);
        if (customerToDelete == null)
            return false;
        salesReportDB.remove(id);

        return true;
    }

    @Override
    public Set<SalesReport> getAll() {
        return salesReportDB;
    }

}
