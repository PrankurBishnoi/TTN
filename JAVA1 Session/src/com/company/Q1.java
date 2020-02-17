package com.company;

import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter main String");
        String str1 = s.nextLine();
        System.out.println("Enter SubString which you want to be replaced in main string::");
        String str2 = s.nextLine();
        System.out.println("Enter SubString with which you want to replace the above substring in main string:");
        String str3 = s.nextLine();
        // Replacing every occurence of str2 in str1 by str3;
        String repstr = str1.replaceAll(str2,str3);
        System.out.println("String after replacement is :"+ repstr);

    }
}
