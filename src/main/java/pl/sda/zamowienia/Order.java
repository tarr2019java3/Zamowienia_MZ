package pl.sda.zamowienia;

import java.util.Date;

public class Order {
    private double quntity;
    private Date orderDate;
    private Customer customer;
    private Product product;

    public Order(double quntity, Date orderDate, Customer customer, Product product) {
        this.quntity = quntity;
        this.orderDate = orderDate;
        this.customer = customer;
        this.product = product;
    }

    public Order (){

    }
}
