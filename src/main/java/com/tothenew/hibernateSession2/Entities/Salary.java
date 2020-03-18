package com.tothenew.hibernateSession2.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class Salary
{
    private java.lang.Double basicsalary;
    private java.lang.Double bonussalary;
    private java.lang.Double taxamount;
    private java.lang.Double specialallowanxesalary;

    public Salary() {
    }

    public Salary(java.lang.Double basicsalary, java.lang.Double bonussalary, java.lang.Double taxamount, java.lang.Double specialallowanxesalary) {
        this.basicsalary = basicsalary;
        this.bonussalary = bonussalary;
        this.taxamount = taxamount;
        this.specialallowanxesalary = specialallowanxesalary;
    }

    public java.lang.Double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(java.lang.Double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public java.lang.Double getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(java.lang.Double bonussalary) {
        this.bonussalary = bonussalary;
    }

    public java.lang.Double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(java.lang.Double taxamount) {
        this.taxamount = taxamount;
    }

    public java.lang.Double getSpecialallowanxesalary() {
        return specialallowanxesalary;
    }

    public void setSpecialallowanxesalary(java.lang.Double specialallowanxesalary) {
        this.specialallowanxesalary = specialallowanxesalary;
    }

    @Override
    public String toString() {
        return "EmpSalary{" +
                "basicsalary=" + basicsalary +
                ", bonussalary=" + bonussalary +
                ", taxamount=" + taxamount +
                ", specialallowanxesalary=" + specialallowanxesalary +
                '}';
    }
}
