package com.tothenew.JPASessionthree.entities;

import javax.persistence.Embeddable;

//Q1. Create a class Address for Author with instance variables
// streetNumber, location, State.
@Embeddable
public class Address
{
    private  Integer streetno;
    private  String location;
    private  String state;

    public Address() {
    }

    public Address(Integer streetno, String location, String state) {
        this.streetno = streetno;
        this.location = location;
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStreetno() {
        return streetno;
    }

    public void setStreetno(Integer streetno) {
        this.streetno = streetno;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetno=" + streetno +
                ", location='" + location + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
