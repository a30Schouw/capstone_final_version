package za.ac.mycput.Entity;
/*
Payment.java
Entity for the Payment
Author: Damian du Toit (219200203)
Date: 06 April 2022
*/

public class Payment {

    public int PaymentId;
    public String PaymentType;
    public double PaymentAmount;

    public Payment(Builder builder) {
        this.PaymentId = builder.PaymentId;
        this.PaymentType = builder.PaymentType;
        this.PaymentAmount = builder.PaymentAmount;
    }

    public int getPaymentId() {
        return PaymentId;
    }

    public void setPaymentId(int PaymentId) {
        this.PaymentId = PaymentId;
    }

    public String getPaymentType() {
        return PaymentType;
    }

    public void setPaymentType(String paymentType) {
        PaymentType = paymentType;
    }

    public double getPaymentAmount() {
        return PaymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        PaymentAmount = paymentAmount;
    }

    public static class Builder {
        public int PaymentId;
        public String PaymentType;
        public double PaymentAmount;

        public Builder setPaymentId(int PaymentId) {
            this.PaymentId = PaymentId;
            return this;
        }
        public Builder setPaymentType(String paymentType) {
            this.PaymentType = PaymentType;
            return this;
        }
        public Builder setPaymentAmount(double paymentAmount) {
            this.PaymentAmount = PaymentAmount;
            return this;
        }

        public Builder copy(Payment payment){
            this.PaymentId = payment.PaymentId;
            this.PaymentType = payment.PaymentType;
            this.PaymentAmount = payment.PaymentAmount;
            return this;
        }

        public Payment build(){
            return new Payment(this);
        }
    }
}
