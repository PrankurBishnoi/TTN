import java.util.Scanner;
// 8. WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal   to  its last character. For the required loop, use a 
// using while statement 

public class Q8a
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);


        while(true)
        {
            System.out.println("Enter the word");
            String str = s.next();
            if(str.equalsIgnoreCase("done"))
                    break;
            else
            {
                if(str.charAt(0)==str.charAt(str.length()-1))
                    System.out.println("The first Character is equal to last character");
                else
                    System.out.println("The first Character is not  equal to last character");
            }
        }
        System.out.println("Out of loop");

    }
}
