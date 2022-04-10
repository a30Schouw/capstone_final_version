package za.ac.mycput.Repository.driver.Impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import za.ac.mycput.Entity.Delivery;
import za.ac.mycput.Entity.Driver;

import za.ac.mycput.Factory.DeliveryFactory;
import za.ac.mycput.Factory.DriverFactory;
import za.ac.mycput.Repository.delivery.Impl.DeliveryRepositoryImpl;


import static org.junit.jupiter.api.Assertions.*;

import static java.lang.System.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class DriverRepositoryImplTest {
    private static final DeliveryRepositoryImpl repository = DeliveryRepositoryImpl.getRepository();

    private static final Delivery delivery1 = DeliveryFactory.createDelivery
            (
                    "214234169",
                    "60 Crip walk",
                    "10 April 2022"
            );


    private static final Delivery delivery2 = DeliveryFactory.createDelivery
            (
                    "214234169",
                    "60 Crip walk",
                    "10 April 2022"
            );


    @Test
    void Create() {
        Delivery created1 = repository.create(delivery1);
        Delivery created2 = repository.create(delivery2);

        assertNotNull(created1);
        assertNotNull(created2);

        out.println("Create: " + created1);
        out.println("Create: " + created2);
    }

    @Test
    void Read() {
        Delivery read1 = repository.read("1644452");
        Delivery read2 = repository.read("1644452");

        assertNotNull(read1);
        assertNotNull(read2);

        out.println("Create: " + read1);
        out.println("Create: " + read2);
    }

    @Test
    void Update() {
        Delivery updated = new Delivery.BuilderDelivery().copy(delivery2).setDeliveryId("2612782").build();
        assertNotNull(repository.update(updated));
        out.println("Update: " + updated);
    }

    @Test
    void Delete() {
        boolean success = repository.delete(delivery1.deliveryId);
        assertTrue(success);
        out.println("Delete: " + success);
    }

    @Test
    void GetAllNurse() {
        out.println("Show All:");
        out.println(repository.getAllDelivery());
    }
}