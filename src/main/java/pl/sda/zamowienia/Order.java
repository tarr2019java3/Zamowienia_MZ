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

    public double getQuntity() {
        return quntity;
    }

    public void setQuntity(double quntity) {
        this.quntity = quntity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
