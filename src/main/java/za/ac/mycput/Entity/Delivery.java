/* Delivery.java
   Entity for the Delivery
   @ author: Joshua Luke Retief (214234169)
   Date: 06 April 2022
 */

package za.ac.mycput.Entity;

public class Delivery {

    public String  deliveryId;
    public String deliveryAddress;
    public String deliveryDate;

    public Delivery(){}

    public Delivery(BuilderDelivery builder){
        this.deliveryId = builder.deliveryId;
        this.deliveryAddress = builder.deliveryAddress;
        this.deliveryDate = builder.deliveryDate;
    }

    //Getters
    public String getDeliveryId() {
        return deliveryId;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    //Setters
    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + deliveryId +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }

    public static class BuilderDelivery{
        public String deliveryId;
        public String deliveryAddress;
        public String deliveryDate;


        public BuilderDelivery setDeliveryId(String deliveryId) {
            this.deliveryId = deliveryId;
            return this;
        }

        public BuilderDelivery setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public BuilderDelivery setDeliveryDate(String deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        public Delivery build(){
            return new Delivery(this);
        }

        public BuilderDelivery copy(Delivery delivery){
            this.deliveryId = delivery.deliveryId;
            this.deliveryAddress = delivery.deliveryAddress;
            this.deliveryDate = delivery.deliveryDate;

            return this;
        }
    }
}
