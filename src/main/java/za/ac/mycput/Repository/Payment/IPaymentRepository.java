package za.ac.mycput.Repository.Payment;

import za.ac.mycput.Entity.Payment;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;
/*
IPaymentRepository.java
IRepository for the Payment
Author: Damian du Toit (219200203)
Date: 07 April 2022
*/

public interface IPaymentRepository extends IRepository<Payment,String> {
    public Set<Payment> getAll();
}
