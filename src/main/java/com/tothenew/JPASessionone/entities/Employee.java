package com.tothenew.JPASessionone.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//Q1.(1) Create an Employee Entity which contains following fields
//
//Name
//
//Id
//
//Age
//
//Location
@Entity
public class Employee
{
    @Id
    @GeneratedValue
    private  Integer id;
    private String name;
    private Integer age;
    private String location;

    public Employee() {
    }

    public Employee(String name, Integer age, String location) {
       // this.id = id;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {

        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
