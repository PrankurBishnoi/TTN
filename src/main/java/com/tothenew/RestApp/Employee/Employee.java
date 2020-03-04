
//Q2 Create an Employee Bean(id, name, age) and
// service to  perform different operations related to employee

//Employee Bean
package com.tothenew.RestApp.Employee;

import java.util.Date;

public class Employee
{
    static int  empcount;
       private String empid;
        private String empname;
       private  double age;

    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", empname='" + empname + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }

    private Date dob;

    public Employee(String empid, String empname, double age, Date dob) {
        this.empid = empid;
        this.empname = empname;
        this.age = age;
        this.dob = dob;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
