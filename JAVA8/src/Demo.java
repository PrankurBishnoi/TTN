import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@FunctionalInterface
interface Len
{
    int len();
}
@FunctionalInterface
interface ConstructRefString
{
    String retString(char [] Char);
}
interface I{
    void display();
}
interface I2{
    void display(int i);
}
class Employee
{
    String id;
    int age;

    public Employee(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
public class Demo
{
    void dummy(int i)
    {
        System.out.println("I am dummy od demo :" + i);
    }
    public static void main(String[] args)
    {
        I i = ()-> System.out.println("I am display of I");
        I2 i2 = (temp)-> System.out.println("I am display of I2 "+temp);
        new Thread(()-> System.out.println("I am thread")).start();

        i.display();
        i2.display(10);

        List<Employee> list = Arrays.asList(new Employee("shivam",30),new Employee("pihu",49),
                new Employee("devansh",43),new Employee("Tom",28));
        Collections.sort(list,(e1,e2)->{ return(e2.age-e1.age);});
        for(Employee e :  list)
            System.out.println(e);
        Demo d = new Demo();
        I2 temp = d::dummy;
        temp.display(10);
        char [] arr = {'a','b','d','d'};
        ConstructRefString string = String::new;
        System.out.println(string.retString(arr));
        list.forEach((e)-> System.out.println(e));
        String s = new String("Shivam");
        Len g = s::length;
        System.out.println(g.len());
        //List<Integer> =
        Arrays.asList(8).stream().filter(f->f%2==0).forEach(System.out::println);
       Stream.of("Shivam","Dev","Pihu","Tommy").filter(name->(name.length()>3)).mapToInt(e->e.length());


    }
}
