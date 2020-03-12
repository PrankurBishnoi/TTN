package com.tothenew.hibernateSession2;

import com.tothenew.hibernateSession2.Services.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HibernateSession2Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext =  SpringApplication.run(HibernateSession2Application.class, args);

		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);

	//employeeService.saveEmployee();
//
//		employeeService.Q1();
//		employeeService.Q4();
		//employeeService.Q5();
		//employeeService.Q678();
		//employeeService.Q9();
	}

}
