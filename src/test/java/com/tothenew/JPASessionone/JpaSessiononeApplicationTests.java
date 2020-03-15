package com.tothenew.JPASessionone;

import com.tothenew.JPASessionone.entities.Employee;
import com.tothenew.JPASessionone.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaSessiononeApplicationTests
{
	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}
	//Q3.Perform Create Operation on Entity using Spring Data JPA
	@Test
	void createOperation()
	{
		Employee employee1 = new Employee("Shivam Agarwal",21,"Noida");
		Employee employee2 = new Employee("Devansh Agarwal",32,"Agra");
		Employee employee3 = new Employee("Akshansh Agarwal",28,"Pilibhit");
		Employee employee4 = new Employee("Abhishek Agarwal",29,"Pilibhit");
		Employee employee5 = new Employee("Arav Junior",30,"Pilibhit");
		Employee employee6 = new Employee("Amen Agarwal",31,"Ooty");
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
		employeeRepository.save(employee4);
		employeeRepository.save(employee5);
		employeeRepository.save(employee6);
	}


	//Q4.Perform Update Operation on Entity using Spring Data JPA
	@Test
	void updateOperation()
	{
		Optional<Employee> optional= employeeRepository.findById(1);
		if(optional.isPresent())
		{
			Employee employee = optional.get();
			employee.setName("Shivam Goel");
			employeeRepository.save(employee);
		}
	}


	//Q5.Perform Delete Operation on Entity using Spring Data JPA
	@Test
	void deleteOperation()
	{

		System.out.println("Before deleting employee");
		Iterable<Employee> list_bef = employeeRepository.findAll();
		list_bef.forEach(System.out::println);

		employeeRepository.deleteById(3);

		System.out.println("After deleting employee with employee id 3 ");
		Iterable<Employee> list_aft = employeeRepository.findAll();
		list_aft.forEach(System.out::println);
	}

	//Q6.Perform Read Operation on Entity using Spring Data JPA
	@Test
	void readOperation()
	{
		Optional<Employee> optional= employeeRepository.findById(1);
		if(optional.isPresent())
		{
			Employee employee = optional.get();
			System.out.println(employee);
		}
	}


	//Q7.Get the total count of the number of Employees.
	@Test
	void countOperation()
	{
		long count = employeeRepository.count();
		System.out.println("The no of employees in employee table is : "+ count);
	}

	//Q8. Implement Pagination and Sorting on the bases of Employee Age
	@Test
	void pagingAndSortiingEmployeeByAge()
	{
		Pageable pageable = PageRequest.of(0,5, Sort.by(Sort.Direction.DESC,"age"));
		Iterable<Employee> iterable = employeeRepository.findAll(pageable);
		iterable.forEach(System.out::println);

	}
	//Q9. using finder to find Employee by Name
	@Test
	void findEmployeesNyName()
	{
		List<Employee> employeeslList = employeeRepository.findByName("Shivam Goel");
		employeeslList.forEach(System.out::println);
	}



	// Q10.using finder to find Employees starting with A character
	@Test
	void findEmployeesStartingWithCharacterA()
	{
		System.out.println("Employees Starting with 'A' are-------------------------> ");
		String pattern = "A%";
		List<Employee> employeeList = employeeRepository.findByNameLike(pattern);
		employeeList.forEach(System.out::println);

	}
	//Q11.Create and use finder to find Employees Between the age of 28 to 32
	@Test
	void findEmployeesByAgeBetween()
	{
		System.out.println("Employees btw age 28 1nd 32 are ----------------------------------------> ");
		List<Employee> employeeList = employeeRepository.findByAgeBetween(28,32);
		employeeList.forEach(System.out::println);



	}

}


