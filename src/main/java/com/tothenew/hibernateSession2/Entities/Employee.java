package com.tothenew.hibernateSession2.Entities;

import javax.persistence.*;



//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="emptype")
@Entity
public class Employee
{
    public Employee() {
    }

    @Id
    @Column(name = "empId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "empFirstName")
    private  String firstName;
    @Column(name = "empLastName")
    private String lastName;
    @Column(name = "empAge")
    private java.lang.Integer age;
    @Column(name = "empSalary")
    @Embedded
    private Salary salary;

    public Employee(String firstName, String lastName, java.lang.Integer age, Salary salary) {
     //   this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public java.lang.Long getId() {
        return id;
    }

    public void setId(java.lang.Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.lang.Integer getAge() {
        return age;
    }

    public void setAge(java.lang.Integer age) {
        this.age = age;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstName + '\'' +
                ", lastname='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
