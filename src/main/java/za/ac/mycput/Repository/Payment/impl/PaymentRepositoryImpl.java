package za.ac.mycput.Repository.Payment.impl;

import za.ac.mycput.Entity.Payment;
import za.ac.mycput.Repository.Payment.IPaymentRepository;

import java.util.HashSet;
import java.util.Set;
/*
PaymentRepositoryImpl.java
Repository Impl for the Payment
Author: Damian du Toit (219200203)
Date: 07 April 2022
*/

public class PaymentRepositoryImpl implements IPaymentRepository {
    private static PaymentRepositoryImpl repository = null;
    private Set<Payment> paymentDB = null;

    private PaymentRepositoryImpl(){
        paymentDB = new HashSet<Payment>();
    }

    public static PaymentRepositoryImpl getRepository(){
        if (repository == null){
            repository = new PaymentRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Payment create(Payment payment){

        boolean created = paymentDB.add(payment);
        if (!created)
            return null;
        return payment;
    }

    @Override
    public Payment read(String payment){
        for (Payment p : paymentDB){
            if (p.getPaymentType().equals(payment))
                return p;
        }
        return null;

    }

    @Override
    public Payment update(Payment payment){

        Payment old = read(payment.getPaymentType());
        if (old != null){
            paymentDB.remove(old);
            paymentDB.add(payment);
            return payment;
        }
        return null;
    }

    @Override
    public boolean delete(String payment){
        Payment paymentToDelete = read(payment);
        if (paymentToDelete == null)
            return false;
        paymentDB.remove(paymentToDelete);
        return true;
    }

    @Override
    public Set<Payment> getAll(){
        return paymentDB;
    }
}
