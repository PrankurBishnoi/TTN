package com.tothenew.hibernateSession2.Entities;

import javax.persistence.*;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="emptype")
public class Employee
{
    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String firstname;
    private String lastname;
    private Integer age;
    @Embedded
    private  EmpSalary salary;

    public Employee( String firstname, String lastname, Integer age, EmpSalary salary) {
     //   this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public EmpSalary getSalary() {
        return salary;
    }

    public void setSalary(EmpSalary salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
