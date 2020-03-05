package com.tothenew.RestApp.Employee;
//import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;
import com.tothenew.RestApp.ExceptionHandler.EmployeeNotFound;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.hateoas.*;
//import org.springframework.hateoas.mvc.ControllerLinkBuilder;
//import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
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
        Employee emp = service.returnEmployeeById(id);
       // Resource<Employee> resource = new Resource<Employee>(emp);
         // ControllerLinkBuilder cont =   linkTo(methodOn(this.getClass()).retAllEmployees());
          //resource.add(cont.withRel("link-name"));
       return emp;

    }

    //Q5 Implement POST http request for Employee to create a new employee.
    @PostMapping("/employees")
    ResponseEntity<Object> addEmployee(@Valid @RequestBody Employee emp)
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

    @PutMapping("/employees/{id}")
    ResponseEntity<Object> updateEmployee(@PathVariable String id, @RequestParam String empname, @RequestParam double age)
    {
        Employee temp = new Employee(id,empname,age,null);
       Employee updated =  service.updateEmp(id,temp);
        URI location =   ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(id).toUri();
        return ResponseEntity.created(location).build();

    }


}
