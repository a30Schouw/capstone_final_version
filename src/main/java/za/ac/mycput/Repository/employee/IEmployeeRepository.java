package za.ac.mycput.Repository.employee;

import za.ac.mycput.Entity.Employee;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    IEmployeeRepository.Java
*/
public interface IEmployeeRepository extends IRepository<Employee,String>
{
    public Set<Employee> getAll();
}
