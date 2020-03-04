package com.tothenew.RestApp.Employee;

import com.tothenew.RestApp.ExceptionHandler.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeService service;

// Q3 Implement GET http request for Employee to get list of employees.
    @GetMapping("/employees")
    List<Employee> retAllEmployees()
    {
       return service.retAllEmployees();
    }

    //Q4 Implement GET http request using path variable top get one employee
    @GetMapping("/employees/{id}")
    Employee getEmployee(@PathVariable String id)
    {
       return service.returnEmployeeById(id);

    }

    //Q5 Implement POST http request for Employee to create a new employee.
    @PostMapping("/employees")
    ResponseEntity<Object> addEmployee(@RequestBody Employee emp)
    {
       Employee e  = service.addEmployee(emp);
      URI location =   ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(e.getEmpid()).toUri();
        return ResponseEntity.created(location).build();

    }


    //Q7. Implement DELETE http request for Employee to delete employee
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable String id)
    {
        Employee e = null;


        e = service.deleteEmployee(id);
        if(e==null)
                throw new EmployeeNotFound("id - "+id);

    }


}
