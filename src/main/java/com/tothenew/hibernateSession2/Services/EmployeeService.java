package com.tothenew.hibernateSession2.Services;

import com.tothenew.hibernateSession2.Entities.EmpSalary;
import com.tothenew.hibernateSession2.Entities.Employee;
import com.tothenew.hibernateSession2.Entities.RegularEmployee;
import com.tothenew.hibernateSession2.Entities.TraineeEmployee;
import com.tothenew.hibernateSession2.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository repository;

//    public void saveEmployee()
//    {
////        repository.save(new Employee("Shivam","Agarwal",22,80000d));
////        repository.save(new Employee("Devansh","Agarwal",18,60000d));
//       // repository.save(new Employee("Pihu","Agarwal",19,89000d));
////        repository.save(new Employee("Tom","Hanks",54,80000d));
////        repository.save(new Employee("Tom","Cruise",45,60000d));
////        repository.save(new Employee("Akshay","Kumar",37,50000d));
//       // repository.save(new Employee("Ramandeep","Singh",37,50000d));
//
//    }
//
//   public void Q1()
//    {
//        System.out.println("Question 1 (JPQL)--------------------------------------->");
//        List<Object[]> list = repository.findEmployees();
//       for(Object [] temp:list)
//       {
//           System.out.print(temp[0]+" ");
//           System.out.println(temp[1]);
//       }
//    }

//    @Transactional
//    public void Q2()
//    {
//        System.out.println("Employees before updating BBBBBBBBBBBBB : ");
//        repository.findAll().forEach(System.out::println);
//
//
//        repository.updateEmployees(100000d);
//
//        System.out.println("Employees After updating AAAAAAAAAAAAAAA : ");
//        repository.findAll().forEach(System.out::println);
//    }
//
//   public  void Q4()
//    {
//        List<Object[]> list = repository.findEmployessEndingWithSingh();
//        System.out.println("Question 1(NAIVE SQL)--------------------------------------->");
//        for(Object [] temp:list)
//        {
//            System.out.print(temp[0]+" ");
//            System.out.print(temp[1]+" ");
//            System.out.println(temp[2]);
//        }
//    }
//    public void Q5()
//    {
//            repository.deleteEmployeesWithAgeGreaterThan45();
//    }

    public void Q678()
    {
//        TraineeEmployee traineeEmployee = new TraineeEmployee("Sanjay","Kumar",
//                25,70000d,500);
//
//        RegularEmployee regularEmployee = new RegularEmployee("Rahul","Sharma",
//                58,90000d,"TATA SKY");
//
//        repository.save(traineeEmployee);
//        repository.save(regularEmployee);



    }
    public void Q9()
    {
        TraineeEmployee traineeEmployee = new TraineeEmployee("Sanjay","Kumar",
                25,new EmpSalary(15000d,5000d,2000d,4000d),500);

        RegularEmployee regularEmployee = new RegularEmployee("Rahul","Sharma",
                58,new EmpSalary(15000d,5000d,2000d,4000d),"TATA SKY");

        repository.save(traineeEmployee);
        repository.save(regularEmployee);



    }

}
