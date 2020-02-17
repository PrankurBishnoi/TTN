package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int i,j,arr1 [] = new int[5];
        int arr2 [] = new int[5];
        System.out.println("Enter array 1 of size 5:");
        for(i=0;i<5;i++)
                arr1[i] = s.nextInt();
        s.nextLine();
        System.out.println("Enter array 2 of size 5:");
        for(i=0;i<5;i++)
            arr2[i] = s.nextInt();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Common elements in two arrays are:\n");
        int len1 = arr1.length;
        int len2 = arr2.length;
        i=0;
        j=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]<arr2[j])
                    i++;
            else if(arr1[i]>arr2[j])
                    j++;
            else
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }


    }

}
