//Create a functional interface whose method takes 2 integers and return one integer.
@FunctionalInterface
interface Demos
{
    int demo(int i1,int i2);
}
public class Q2
{
    public static void main(String[] args)
    {
            Demos obj = (i1,i2)->
            {
                return (i1*i2);

            };
        System.out.println("The product of 5 and 55 is : "+obj.demo(5,55));
    }

}
