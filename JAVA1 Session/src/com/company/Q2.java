package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String in which duplicate words are to be found:");
        String str = s.nextLine();
        String [] arr = str.split(" ");
         Arrays.sort(arr);
        int i=0;
//        for(i=0;i<arr.length;i++)
//            System.out.println(arr[i]);

       int count =1;
       for(i=1;i<arr.length;i++)
       {
           if(arr[i].equalsIgnoreCase(arr[i-1]))
           {
               count++;
           }
           else
           {
               System.out.println(arr[i-1] + ":" + count);
               count=1;
           }
       }

        System.out.println(arr[i-1] + ":" + count);


        }


}
