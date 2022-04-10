package za.ac.mycput.Factory;

import org.junit.Test;
import za.ac.mycput.Entity.Admin;
import za.ac.mycput.Entity.Employee;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    EmployeeFactoryTest.Java
*/
public class EmployeeFactoryTest
{
    @Test
    public void test()
    {
        Employee employee = EmployeeFactory.createEmployee("Devon",
                "Pays","0662686200","Driver","09");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }
}