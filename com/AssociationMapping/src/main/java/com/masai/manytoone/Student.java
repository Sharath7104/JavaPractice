package com.masai.manytoone;

import javax.persistence.*;

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AID")
    private Address address;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
