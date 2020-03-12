package com.tothenew.hibernateSession2.Repositories;

import com.tothenew.hibernateSession2.Entities.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee,Long>
{
//    @Query("select firstname,lastname from Employee e where e.salary>(select avg(salary) from Employee) order by e.age asc, e.salary desc")
//    List<Object[]> findEmployees();
//
//
////    @Modifying
////    @Query("update Employee e set e.salary=:Salary where e.salary IN(select salary from (select salary from Employee) temp)")
////    void updateEmployees(@Param("Salary") Double Salary);
//
//
//    @Query(value = "select id,firstname,age from employee where lastname like '%singh'",nativeQuery = true)
//    List<Object[]> findEmployessEndingWithSingh();
//
//    @Transactional
//    @Modifying
//    @Query(value = "delete from employee where age>45",nativeQuery = true)
//    void deleteEmployeesWithAgeGreaterThan45();




}
