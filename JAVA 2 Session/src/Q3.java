import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = s.nextLine();
        char [] arr = str.toCharArray();
        int n = arr.length;
        char temp;
        // Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++)
        {
            for (int i = 0; i < n-j-1; i++)
            {
                if (Character.toLowerCase(arr[i])>Character.toLowerCase(arr[i+1]))
                {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        str = String.valueOf(arr);
        System.out.println("sorted string is :"+str);
    }
}
