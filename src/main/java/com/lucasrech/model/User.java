package com.lucasrech.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private Integer id;
    private String phone;
    private String address;
    private List<Book> books;

    public User(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.books = new ArrayList<Book>();
    }

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
