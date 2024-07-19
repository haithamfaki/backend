package com.Decoration.design.Decoration.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Orders")

public class Orderlist {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    
    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }
    public Orderlist(long id) {
        this.id = id;
    }
    private String Email;
    private String name;
    private Date orderdate;
    private int phonenumber;
    private String address;

    public Orderlist(Date orderdate) {
        this.orderdate = orderdate;
    }
    public Orderlist(String orderDetails) {
    }
    public Orderlist() {
    }
    
    public Date getOrderDetails() {
        return orderdate;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getOrderdate() {
        return orderdate;
    }
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    }   


