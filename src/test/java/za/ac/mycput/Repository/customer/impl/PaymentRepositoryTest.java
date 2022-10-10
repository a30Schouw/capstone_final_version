package za.ac.mycput.Repository.customer.impl;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import za.ac.mycput.Entity.Payment;
import za.ac.mycput.Factory.PaymentFactory;
import za.ac.mycput.Repository.Payment.impl.PaymentRepositoryImpl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
/*
PaymentRepositoryTest.java
Test for the PaymentRepository
Author: Damian du Toit (219200203)
Date: 08 April 2022
*/

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaymentRepositoryTest {

    private static PaymentRepositoryImpl repository = PaymentRepositoryImpl.getRepository();
    private static Payment payment = PaymentFactory.payment(53, "EFT", 22.50);
    private static Payment payment2 = PaymentFactory.payment(77, "Cash", 50.0);

    @Test
    public void a_Create()
    {
        Payment create = repository.create(payment);
        assertEquals(payment.getPaymentId(), create.getPaymentId());
        System.out.println("Create: " + create);
    }

    @Test
    public void b_Read()
    {
        Payment Create = repository.create(payment2);
        Payment paymentRead= repository.read(Create.getPaymentType());
        assertNotNull(Create.getPaymentType(),payment.getPaymentType());
        System.out.println("Read : " + paymentRead);
    }

    @Test
    public void c_Update()
    {
        Payment Create=repository.create(payment);
        Payment paymentUpdate= new Payment.Builder().copy(payment)
                .setPaymentType("EFT")
                .build();
        paymentUpdate = repository.update(paymentUpdate);
        System.out.println("Old: "+ payment);
        System.out.println("Updated payment type: " + paymentUpdate);

    }

    @Test
    public void d_Delete()
    {
        Payment Create = repository.create(payment);
        repository.delete(Create.getPaymentType());
        System.out.println("Deleted: "+ Create.getPaymentType());
    }
    @Test
    public void e_GetAll()
    {
        System.out.println("Payments: "+ repository.getAll());
    }
}
