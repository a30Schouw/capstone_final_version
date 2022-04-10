package za.ac.mycput.Factory;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    EmployeeFactory.Java
*/
import za.ac.mycput.Entity.Employee;

public class EmployeeFactory
{
    public static Employee createEmployee(String empFirstName, String empLastName, String empPhoneNumber, String empRole, String empID)
    {
        Employee employee  = new Employee.Builder()
                .setEmpFirstName(empFirstName)
                .setEmpLastName(empLastName)
                .setEmpPhoneNumber(empPhoneNumber)
                .setEmpRole(empRole)
                .setEmpID(empID)
                .build();
        return employee;
    }
}
