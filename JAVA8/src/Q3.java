//Using (instance) Method reference create and apply add and
// subtract method and using (Static) Method reference create and
// apply multiplication method for the functional interface created.
@FunctionalInterface
interface Calculator
{
    int calc(int a,int b);
}


public class Q3
{
    void instanceMethod()
    {
        System.out.println("Hi there I am instance method ");
    }
     int add(int a,int b)
    {
        return a+b;
    }
    int subtract(int a,int b)
    {
        return a-b;
    }
    static int product(int a ,int b)
    {
        return a*b;
    }
    public static void main(String[] args)
    {
            Q3 obj = new Q3();
            Calculator obj1 = obj :: add;
            Calculator obj2 = obj::subtract;

            Calculator obj3 = Q3 :: product;
        System.out.println("The sum of 5 and 10 is : "+obj1.calc(5,10));

        System.out.println("The difference of 5 and 10 is : "+obj2.calc(5,10));
        System.out.println("The product of 5 and 10 is : "+obj3.calc(5,10));

    }
}
