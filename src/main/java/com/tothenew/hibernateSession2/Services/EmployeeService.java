package com.tothenew.hibernateSession2.Services;

import com.tothenew.hibernateSession2.Entities.Employee;
//import com.tothenew.hibernateSession2.Entities.RegularEmployee;
//import com.tothenew.hibernateSession2.Entities.TraineeEmployee;
import com.tothenew.hibernateSession2.Entities.Salary;
import com.tothenew.hibernateSession2.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository repository;

    public void saveEmployee()
    {
        Employee emp = new Employee("Shivam","Agarwal",21,new Salary(40000.0,3000.0,4000.0,3000.0));

       repository.save(emp);
      repository.save(new Employee("Devansh","Agarwal",18,new Salary(40000.0,3000.0,4000.0,3000.0)));
//        repository.save(new Employee("Pihu","Agarwal",19,89000d));
//        repository.save(new Employee("Tom","Hanks",54,80000d));
//        repository.save(new Employee("Tom","Cruise",45,60000d));
//        repository.save(new Employee("Akshay","Kumar",37,50000d));
//        repository.save(new Employee("Ramandeep","Singh",37,50000d));

    }
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

//
//    public void Q2()
//    {
//        System.out.println("Employees before updating BBBBBBBBBBBBB : ");
//        repository.findAll().forEach(System.out::println);
//
//        Double avgsalary = repository.averageSalary();
//        repository.updateEmployees(100000.0,avgsalary);
//
//        System.out.println("Employees After updating AAAAAAAAAAAAAAA : ");
//        repository.findAll().forEach(System.out::println);
//    }
//    public void Q3()
//    {
//        System.out.println("Deleting all empployees with minimum salary:");
//
//        System.out.println("Employees before deleting BBBBBBBBBBBBB : ");
//        repository.findAll().forEach(System.out::println);
//
//        Double minsalary = repository.minSalary();
//
//        System.out.println("Minimum Salary is : "+ minsalary);
//        repository.deleteEmployees(minsalary);
//
//        System.out.println("Employees Afterdeleting AAAAAAAAAAAAAAA : ");
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

//    public void Q678()
//    {
//        TraineeEmpl public void Q2()
// {
// System.out.println("Employees before updating BBBBBBBBBBBBB : ");
// repository.findAll().forEach(System.out::println);
//
// Double avgsalary = repository.averageSalary();
// repository.updateEmployees(100000.0,avgsalary);
//
// System.out.println("Employees After updating AAAAAAAAAAAAAAA : ");
// repository.findAll().forEach(System.out::println);
// }oyee traineeEmployee = new TraineeEmployee("Sanjay","Kumar",
//                25,70000d,500);
//
//        RegularEmployee regularEmployee = new RegularEmployee("Rahul","Sharma",
//                58,90000d,"TATA SKY");
//
//        repository.save(traineeEmployee);
//        repository.save(regularEmployee);



 //   }
//    public void Q9()
//    {
//        TraineeEmployee traineeEmployee = new TraineeEmployee("Sanjay","Kumar",
//                25,new EmpSalary(15000d,5000d,2000d,4000d),500);
//
//        RegularEmployee regularEmployee = new RegularEmployee("Rahul","Sharma",
//                58,new EmpSalary(15000d,5000d,2000d,4000d),"TATA SKY");
//
//        repository.save(traineeEmployee);
//        repository.save(regularEmployee);
//
//
//
//    }
//    public void deleteEmp()
//    {
//        repository.deleteEmployee();
//    }

}
