package za.ac.mycput.Factory;

import org.junit.Test;
import za.ac.mycput.Entity.Admin;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    AdminFactoryTest.Java
*/
public class AdminFactoryTest
{
    @Test
    public void test()
    {
        Admin admin = AdminFactory.createAdmin("Brad",
                "Raatz","0662686801","01");
        System.out.println(admin.toString());
        assertNotNull(admin);
    }
}