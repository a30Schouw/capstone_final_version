package za.ac.mycput.Factory;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    AdminFactory.Java
*/
import za.ac.mycput.Entity.Admin;

public class AdminFactory
{
    public static Admin createAdmin(String adminFirstName, String adminLastName, String adminPhoneNumber, String adminID)
    {
        Admin admin = new Admin.Builder()
                .setAdminFirstName(adminFirstName)
                .setAdminLastName(adminLastName)
                .setAdminPhoneNumber(adminPhoneNumber)
                .setAdminID(adminID)
                .build();
        return admin;
    }
}
