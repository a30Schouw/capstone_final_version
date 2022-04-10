package za.ac.mycput.Repository.employee.impl;

import za.ac.mycput.Entity.Employee;
import za.ac.mycput.Repository.employee.IEmployeeRepository;

import java.util.HashSet;
import java.util.Set;

/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    EmployeeRepositoryImpl.Java
*/
public class EmployeeRepositoryImpl implements IEmployeeRepository
{
    private static EmployeeRepositoryImpl repository = null;
    private Set<Employee> employeeDB = null;

    private EmployeeRepositoryImpl()
    {
        employeeDB = new HashSet<Employee>();
    }

    public static EmployeeRepositoryImpl getRepository()
    {
        if(repository == null) {
            repository = new EmployeeRepositoryImpl();
        }
        return repository;
    }
    @Override
    public Employee create(Employee employee)
    {
        boolean success = employeeDB.add(employee);
        if(!success)
            return null;
        return employee;
    }

    @Override
    public Employee read(String empID)
    {
        for (Employee e : employeeDB)
        {
            if (e.getEmpID().equals(empID))
                return e;
        }
        return null;
    }

    @Override
    public Employee update(Employee employee)
    {
        Employee oldEmployee = read(employee.getEmpID());
        if (oldEmployee!= null)
        {
            employeeDB.remove(oldEmployee);
            employeeDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String empID)
    {
        Employee employeeToDelete = read(empID);
        if(employeeToDelete == null)
            return false;
        employeeDB.remove(employeeToDelete);
        return true;
    }

    @Override
    public Set<Employee> getAll() {
        return employeeDB;
    }
}
