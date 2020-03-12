package com.tothenew.hibernateSession2.Entities;

import javax.persistence.Embeddable;

@Embeddable
public class EmpSalary
{
    private Double basicsalary;
    private Double bonussalary;
    private Double taxamount;
    private Double specialallowanxesalary;

    public EmpSalary() {
    }

    public EmpSalary(Double basicsalary, Double bonussalary, Double taxamount, Double specialallowanxesalary) {
        this.basicsalary = basicsalary;
        this.bonussalary = bonussalary;
        this.taxamount = taxamount;
        this.specialallowanxesalary = specialallowanxesalary;
    }

    public Double getBasicsalary() {
        return basicsalary;
    }

    public void setBasicsalary(Double basicsalary) {
        this.basicsalary = basicsalary;
    }

    public Double getBonussalary() {
        return bonussalary;
    }

    public void setBonussalary(Double bonussalary) {
        this.bonussalary = bonussalary;
    }

    public Double getTaxamount() {
        return taxamount;
    }

    public void setTaxamount(Double taxamount) {
        this.taxamount = taxamount;
    }

    public Double getSpecialallowanxesalary() {
        return specialallowanxesalary;
    }

    public void setSpecialallowanxesalary(Double specialallowanxesalary) {
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
