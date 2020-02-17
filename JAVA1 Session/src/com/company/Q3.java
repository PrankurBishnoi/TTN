package com.company;

import java.util.Scanner;

public class Q3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base String : ");
        String str = s.nextLine();
       // int [] arr  = new int[255];
        System.out.println("Enter the character ofr frequency determination  in base string: ");
        char c = s.next().charAt(0);
        String temp = str.replaceAll(String.valueOf(c),"");
        int count = str.length()-temp.length();
        System.out.println("The frequency of "+ c + " is "+count);


    }
}
