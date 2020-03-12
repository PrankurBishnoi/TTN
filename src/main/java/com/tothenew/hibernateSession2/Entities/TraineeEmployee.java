package com.tothenew.hibernateSession2.Entities;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("TraineeEmployee")
public class TraineeEmployee extends Employee
{
    private Integer BootcampScore;

    public TraineeEmployee()
    {
        super();
    }

    public TraineeEmployee(String firstname, String lastname, Integer age, EmpSalary salary, Integer bootcampScore)
    {
        super(firstname, lastname, age, salary);
        BootcampScore = bootcampScore;
    }

    public Integer getBootcampScore() {
        return BootcampScore;
    }

    public void setBootcampScore(Integer bootcampScore) {
        BootcampScore = bootcampScore;
    }

    @Override
    public String toString() {
        return "TraineeEmployee{" +
                "BootcampScore=" + BootcampScore +
                '}';
    }
}
