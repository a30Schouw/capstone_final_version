package za.ac.mycput.Factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import za.ac.mycput.Entity.Payment;
/*
PaymentFactoryTest.java
Test for the PaymentFactory
Author: Damian du Toit (219200203)
Date: 08 April 2022
*/

public class PaymentFactoryTest {
    @Test
    public void test(){
        Payment payment = new Payment.Builder()
                .setPaymentId(521)
                .setPaymentType("EFT")
                .setPaymentAmount(143.50)
                .build();
        System.out.println(payment.toString());
        Assertions.assertNotNull(payment.toString());
    }
}
