//Implement multiple inheritance with default method inside  interface.
interface Interface1
{
    default  void sum(int a , int b)
    {
        System.out.println("In default method of interface 1 :");
        System.out.println("The sum is : "+ (a+b));
    }
}
interface Interface2
{
    default  void product(int a , int b)
    {
        System.out.println("In default method of interface 2 :");
        System.out.println("The product is : "+ (a*b));
    }
}
public class Q8 implements Interface1,Interface2
{
    public static void main(String[] args)
    {
        Q8 obj = new Q8();
       obj.sum(10,90);
       obj.product(10,90);

    }


}
