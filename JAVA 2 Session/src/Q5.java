
class Employee
{
    String emp_name;
    String emp_city;


}

public class Q5 implements Cloneable
{
    Employee e;
    public Q5()
    {

    }
    public Q5(Q5 obj) // Copy Constructor
    {
        Employee e = new Employee();
        e.emp_name = obj.e.emp_name;
        e.emp_city = obj.e.emp_city;
        this.e = e;

    }
    @Override
    public Object clone() throws CloneNotSupportedException
    {


        Q5 temp = (Q5)(super.clone());
        Employee emp = new Employee();
        emp.emp_name = temp.e.emp_name;
        emp.emp_city=temp.e.emp_city;
        temp.e = emp;
        return temp;
    }
    public static void main(String args[]) throws CloneNotSupportedException
    {
        Employee emp = new Employee();
        emp.emp_name = "Shivam";
        emp.emp_city="Pilibhit";
        Q5 obj1 = new Q5();
        obj1.e = emp;
        System.out.println("Employee name is"+obj1.e.emp_name);
        System.out.println("Employee city is"+obj1.e.emp_city);
          Q5 obj2 = (Q5)obj1.clone();
        System.out.println("After cloning the object by clone method  ");
        System.out.println("Employee name is : "+obj2.e.emp_name);
        System.out.println("Employee city is "+obj2.e.emp_city);

        //Copy Constructor Method
        Q5 copy_const_obj = new Q5(obj2);
        System.out.println("After cloning the object by copy constructor method  ");
        System.out.println("Employee name is : "+copy_const_obj.e.emp_name);
        System.out.println("Employee city is "+copy_const_obj.e.emp_city);
    }
}
