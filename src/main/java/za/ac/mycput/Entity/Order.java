package za.ac.mycput.Entity;
/*
 * Order.java
 * Klaus Traubner 218009496
 * 6 April 2022
 * Order entity
 * */

public class Order {

    private int orderId;
    private String orderAddress;

    private Order() {}

    private Order(Builder builder) {
        this.orderAddress = builder.orderAddress;
        this.orderId = builder.orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    @Override

    public String toString() {
        return "Builder{" +
                "orderId='" + orderId + '\'' +
                ", orderAddress='" + orderAddress + '\'';
    }

    public static class Builder {
        private String orderAddress;
        private int orderId;

        public Builder orderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder orderAddress(String orderAddress) {
            this.orderAddress = orderAddress;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

        public Builder copy (Order order) {
            this.orderAddress = order.orderAddress;
            this.orderId = order.orderId;
            return this;
        }

    }

}

