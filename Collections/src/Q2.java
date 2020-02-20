import java.util.*;
import java.util.Scanner;

// Write a method that takes a string and returns the number of unique characters in the string.
public class Q2
{
    public static Set<Character> getUniqueChars(String str)
    {
        Character arr [] = new Character[str.length()];
        int i=0;
        while(i<str.length())
        {
            arr[i] = Character.toLowerCase(str.charAt(i));
            i++;
        }

        Set<Character> uniqchars = new HashSet<Character>((Arrays.asList(arr)));

        return uniqchars;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        Set<Character> uniquechars = Q2.getUniqueChars(str);
        System.out.println(uniquechars);
        System.out.println("The no of unique characters are : " + uniquechars.size());


    }

}
