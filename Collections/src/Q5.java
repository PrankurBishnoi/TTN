import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Write a program to sort Employee objects based on highest salary using Comparator.
// Employee class{ Double Age; Double Salary; String Name
class Employee implements Comparator<Employee>
{
    private static int temp=1;
    private String empid;
    private String name;
    private double Salary;
   private double age;
    public Employee()
    {

    }
    public Employee( String name, double salary, double age)
    {
        this.empid = String.valueOf(temp++);
        this.name = name;
        this.Salary = salary;
        this.age = age;
    }



    public String getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public double getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid='" + empid + '\'' +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Employee e1, Employee e2)
    {
        return ((int) ((e2.getSalary()) - (e1.getSalary())));
    }
}
public class Q5
{
    public static void main(String[] args)
    {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("Shivam",60000,30));
        list.add(new Employee("Devansh",50000,25));
        list.add(new Employee("Pihu",30000,40));
        list.add(new Employee("Sam",80000,50));
        list.add(new Employee("John",90000,60));
        list.add(new Employee("Jeff",30000,70));
        System.out.println("Before sorting on salary : ");
        for(Employee e : list)
            System.out.println(e.toString());
        Collections.sort(list, new Employee());
        System.out.println("After sorting on salary : ");
        for(Employee e : list)
            System.out.println(e.toString());
    }
}
