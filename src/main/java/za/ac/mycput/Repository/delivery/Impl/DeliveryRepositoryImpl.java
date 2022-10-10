/*DeliveryRepositoryImpl.java
   Class for the DeliveryRepositoryImpl
   Author: Joshua Retief (214234169)
   Date: 09 April 2022
 */

package za.ac.mycput.Repository.delivery.Impl;

import za.ac.mycput.Entity.Delivery;
import za.ac.mycput.Repository.delivery.IDeliveryRepository;

import java.util.HashSet;
import java.util.Set;

public class DeliveryRepositoryImpl implements IDeliveryRepository
{
    public static DeliveryRepositoryImpl repository = null;
    public Set<Delivery> deliveryDB = null;

    private DeliveryRepositoryImpl(){
        deliveryDB = new HashSet<Delivery>();
    }

    public static DeliveryRepositoryImpl getRepository(){
        if (repository == null)
        {
            repository = new DeliveryRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Delivery create(Delivery delivery) {
        boolean success = deliveryDB.add(delivery);
        if(!success)
            return null;
        return delivery;
    }

    @Override
    public Delivery read(String deliveryId) {
        for (Delivery delivery : deliveryDB){
            if (delivery.getDeliveryId().equals(deliveryId))
                return delivery;
        }
        return null;
    }

    @Override
    public Delivery update(Delivery delivery) {
        Delivery oldDriver = read(delivery.getDeliveryId());
        if (oldDriver != null)
        {
            deliveryDB.remove(oldDriver);
            deliveryDB.add(delivery);
            return delivery;
        }
        return null;
    }

    @Override
    public boolean delete(String deliveryId) {
        for (Delivery deleteDelivery : deliveryDB)
            if (deleteDelivery.deliveryId.equals(deliveryId))
            {
                return false;
            }
        return true;
    }

    @Override
    public Set<Delivery> getAllDelivery() {
        return deliveryDB;
    }
}
