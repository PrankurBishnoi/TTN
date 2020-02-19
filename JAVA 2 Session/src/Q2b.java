//Remove the Temp.class from the directory and then run the program....It will throw the NoClassdef found error
public class Q2b
{
    public static void main(String[] args)
    {
        try {
            Temp temp = new Temp(5);
            System.out.println(temp.a);
        }catch(NoClassDefFoundError e)
        {
            e.printStackTrace();
        }
    }
}
class Temp
{

    int a;
    Temp(int a)
    {
        this.a = a;
    }

}