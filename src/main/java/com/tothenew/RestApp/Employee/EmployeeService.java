
//Q2 Create an Employee Bean(id, name, age) and
// service to  perform different operations related to employee
//Employee Service
package com.tothenew.RestApp.Employee;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class EmployeeService
{
    public static List<Employee> list = new ArrayList<Employee>();
    static
    {
        list.add(new Employee(String.valueOf(++(Employee.empcount)),"Shivam",21,new Date()));
        list.add(new Employee(String.valueOf(++(Employee.empcount)),"Devansh",18,new Date()));
        list.add(new Employee(String.valueOf(++(Employee.empcount)),"Pihu",16,new Date()));
        list.add(new Employee(String.valueOf(++(Employee.empcount)),"Sam",15,new Date()));
    }

    public  List<Employee> retAllEmployees()
    {
        return list;
    }
    public Employee returnEmployeeById(String id)
    {
        for(Employee emp : list)
        {
            if(emp.getEmpid().equalsIgnoreCase(id))
                    return emp;
        }
        return null;
    }
    public Employee  addEmployee(Employee emp)
    {
        emp.setEmpid(String.valueOf(++(Employee.empcount)));
        list.add(emp);
        return emp;
    }
    public Employee deleteEmployee(String id)
    {
        Employee emp=null;

        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
             emp = (Employee) itr.next();
            if(emp.getEmpid().equalsIgnoreCase(id))
            {
                    itr.remove();
                    return emp;
            }
        }
            return null;
    }

}
