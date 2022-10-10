package za.ac.mycput.Repository.employee.impl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.mycput.Entity.Employee;
import za.ac.mycput.Factory.EmployeeFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    AdminRepositoryImplTest.Java
*/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest
{

    private static EmployeeRepositoryImpl repository = EmployeeRepositoryImpl.getRepository();
    private static Employee employee = EmployeeFactory.createEmployee("Devon","May","0662686800","Driver","01");
    private static Employee employee2 = EmployeeFactory.createEmployee("Sean","Benny","0662686809","Admin","04");

    @Test
    public void a_Create()
    {
        Employee create = repository.create(employee);
        assertEquals(employee.getEmpID(), create.getEmpID());
        System.out.println("Create: " + create);
    }

    @Test
    public void b_Read()
    {
        Employee Create =repository.create(employee2);
        Employee employeeRead= repository.read(Create.getEmpID());
        assertNotNull(Create.getEmpID(),employee.getEmpID());
        System.out.println("Read : " + employeeRead);
    }

    @Test
    public void c_Update()
    {
        Employee Create=repository.create(employee);
        Employee employeeUpdate= new Employee.Builder().copy(employee)
                .setEmpRole("Admin")
                .build();
        employeeUpdate = repository.update(employeeUpdate);
        System.out.println("Old: "+ employee);
        System.out.println("Updated Employee Role : "+ employeeUpdate);

    }

    @Test
    public void d_Delete()
    {
        Employee Create =repository.create(employee);
        repository.delete(Create.getEmpID());
        System.out.println("Deleted: "+Create.getEmpID());
    }
    @Test
    public void e_GetAll()
    {
        System.out.println("Employees: "+ repository.getAll());
    }
}