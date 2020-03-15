package com.tothenew.JPASessionone.repositories;

import com.tothenew.JPASessionone.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


//Q2.Set up EmployeeRepository with Spring Data JPA
public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Integer>
{

    //Q9. Create and use finder to find Employee by Name
    List<Employee> findByName(String name);

    //Q10.Create and use finder to find Employees starting with A character
    List<Employee> findByNameLike(String pattern);

    //Q11.Create and use finder to find Employees Between the age of 28 to 32
    List<Employee> findByAgeBetween(Integer startAge, Integer endAge);
}
