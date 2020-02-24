//Create an Employee Class with instance variables (String) name, (Integer)age,
// (String)city and get the instance of the Class using constructor reference
 class Employees {
    public Employees(String name, String city, Integer age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    String name;
    String city;
    Integer age;


    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

}
interface Reference
{
    Employees retRef(String name, String city, Integer age);
}
class Q4
{
    public static void main(String[] args)
    {
            Reference obj = Employees :: new;
            Employees obj1 = obj.retRef("Shivam Agarwal","Pilibhit",21);
        System.out.println(obj1);
    }

}
