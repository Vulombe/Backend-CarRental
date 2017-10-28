package com.vehicleRental.domain;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String orderDate;

    @OneToOne
    private Customer customer;



    public Orders(){}

    public Orders(Builder builder) {
        this.id = builder.id;
        this.orderDate = builder.orderDate;
        this.customer = builder.customer;
    }

    public static class Builder{
        private Long id;
        private Customer customer;
            private String orderDate;

        public Builder customer(Customer value)
        {
            this.customer = value;
            return this;
        }

        public Builder id(long value)
        {
            this.id = value;
            return this;
        }
        public Builder orderDate(String value)
        {
            this.orderDate = value;
            return this;
        }


        public Orders build()
        {
            return new Orders(this);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
}