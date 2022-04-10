package za.ac.mycput.Factory;

import za.ac.mycput.Entity.Payment;
/*
PaymentFactory.java
Factory for the Payment
Author: Damian du Toit (219200203)
Date: 07 April 2022
*/

public class PaymentFactory {

    public static Payment payment(int PaymentId, String PaymentType, double PaymentAmount){

        if (PaymentId <= 0 || PaymentType.isEmpty() || PaymentAmount < 0.0)
            return null;

        Payment payment = new Payment.Builder()
                .setPaymentId(PaymentId)
                .setPaymentType(PaymentType)
                .setPaymentAmount(PaymentAmount)
                .build();

        return payment;
    }
}