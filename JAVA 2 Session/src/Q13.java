import java.util.Scanner;

class AgeInvalidException extends Exception
{
        public AgeInvalidException(String message)
        {
            super(message);
        }
}
public class Q13
{
    int age;

    public static void main(String[] args)
    {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter age : ");

            int age = s.nextInt();
            if (age > 0)
                System.out.println("Valid age");
            else
                throw (new AgeInvalidException("Invalid age"));
        }catch(AgeInvalidException e)
        {
            System.out.println(e.getMessage());
        }

    }

}
