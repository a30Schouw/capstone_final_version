package za.ac.mycput.Repository.admin;

import za.ac.mycput.Entity.Admin;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;
/*
    Author : Devon Sherwyn May
    Student number : 219168296
    Date : 10 April 2022
    IAdminRepository.Java
*/
public interface IAdminRepository extends IRepository<Admin,String>
{
    public Set<Admin> getAll();
}

