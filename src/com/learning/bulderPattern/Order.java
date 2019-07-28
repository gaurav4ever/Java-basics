package com.learning.bulderPattern;

import java.util.Date;

public class Order {

    private final String orderId;
    private final String customerId;
    private final String carId;
    private final Date createdAt;

    public Order(Builder builder) {
        this.orderId = builder.orderId;
        this.customerId = builder.customerId;
        this.carId = builder.carId;
        this.createdAt = builder.createdAt;
    }

    public static class Builder {

        String orderId;
        String customerId;
        String carId;
        Date createdAt;

        private Builder() {

        }

        public static Builder newInstance() {
            return new Builder();
        }

        public Builder setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setCarId(String carId) {
            this.carId = carId;
            return this;
        }

        public Builder setCreatedAt(Date createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
