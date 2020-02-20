import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Write a method that takes a string and print the number of occurrence of each character characters in the string.
public class Q3
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        HashMap<Character,Integer> freq = new HashMap<>();
        int i=0;
        while(i<str.length())
        {
            Character temp = str.charAt(i);
            if(!freq.containsKey(temp))
            {
                freq.put(str.charAt(i),1);
            }
            else
            {
                Integer in = (Integer)(freq.get(temp));
                in = in +1;
                    freq.replace(temp,in);
            }
        i++;
        }
        for(Map.Entry entry : freq.entrySet())
        {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
