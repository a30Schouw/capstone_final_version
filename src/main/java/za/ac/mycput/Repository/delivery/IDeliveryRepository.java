/*IDeliveryRepository.java
   Interface for the DeliveryRepositoryImpl
   Author: Joshua Retief (214234169)
   Date: 09 April 2022
 */

package za.ac.mycput.Repository.delivery;

import za.ac.mycput.Entity.Delivery;
import za.ac.mycput.Repository.IRepository;

import java.util.Set;

public interface IDeliveryRepository extends IRepository<Delivery, String>
{
    public Set<Delivery> getAllDelivery();
}
