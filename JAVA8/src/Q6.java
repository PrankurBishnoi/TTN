//Create and access default and static method of an interface.
interface Interface
{
    static void demoMethod(int a , int b)
    {
        System.out.println("I am a static method ");
        System.out.println("The Sum of "+ a + " and " + b +" is : "+ (a+b));
    }
    default void defaultMethod()
    {
        System.out.println("I am a default method..");
    }
}
public class Q6 implements  Interface
{
    public static void main(String[] args)
    {
        Q6 obj = new Q6();
        Interface.demoMethod(10,90);
        obj.defaultMethod();
    }
}

