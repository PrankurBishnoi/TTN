
//Q2 Create an Employee Bean(id, name, age) and
// service to  perform different operations related to employee

//Employee Bean

//Q9. Apply validation while create a new employee using POST http Request.
package com.tothenew.RestApp.Employee;

import javax.validation.constraints.*;
import java.util.Date;

public class Employee
{
    static int  empcount;

     @Size(min=1,max=10,message = "The employe id should be 1-10 characters long..")
       private String empid;

        @Size(min=1,max=15,message = "The employee name  should be 1-10 characters long..")
        private String empname;


        @Min(value = 15,message = "Minimum age of employee must be 15")
        @Max(value = 65,message = "Maximum age of employee must be 65")
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
    @Past(message = "DOB can't be in present")
    private Date dob;

    public Employee(String empid, String empname, double age, Date dob)
    {
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
