import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q1
{
    //Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator,
    // find the sum of the numbers in List.
    public static void main(String[] args)
    {
        List<Float> list = new ArrayList<Float>();
        Scanner s = new Scanner(System.in);
        int i=0;
        while(i<5)
        {
            System.out.println("Enter the " +(i+1)+" item (Real number)");
            list.add(s.nextFloat());
            i++;
        }
        Iterator<Float> itr = list.iterator();
        float sum =0;
        while(itr.hasNext())
        {
            sum +=itr.next();
    }
        System.out.println("The sun of elements is : " + sum);
    }
}
