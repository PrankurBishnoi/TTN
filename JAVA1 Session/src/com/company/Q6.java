package com.company;

import java.util.Scanner;

public class Q6
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter array of size 5 such that every element except one element is repeated twice:");
        int single = 0;
        int arr[] = new int[5];
        int i = 0;
        for (i = 0; i < 5; i++)
            arr[i] = s.nextInt();
        for (i = 0; i < 5; i++)
            single = single ^ arr[i];

        System.out.println("The single element is :" + single);
    }
}
