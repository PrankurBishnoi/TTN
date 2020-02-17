package com.company;

import java.util.Scanner;

public class Q4
{
    public static void main(String[] args)
    {
        int lcl=0,ucl=0,dig=0,spclc=0;
        System.out.println("Enter the string:");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len = str.length();
        int i=0;

        for(i=0;i<str.length();i++)
        {
            char c = str.charAt(i);
            if (Character.isLetter(c) && Character.isUpperCase(c))
                ucl++;
            else if (Character.isLetter(c) && Character.isLowerCase(c))
                lcl++;
            else if (Character.isDigit(c))
                dig++;
            else
                spclc++;
        }
        System.out.println("Number & percentage of upper case letter is : "+ ucl +" "+ (float)((float)(ucl*100)/len)+"%");
        System.out.println("Number & percentage of lower case letter is : "+ lcl+" "+ (float)((float)(lcl*100)/len)+"%");
        System.out.println("Number & percentage of digits is : "+ dig+" " + (float)((float)(dig*100)/len)+"%");
        System.out.println("Number & percentage of special character is : "+ spclc+" " + (float)((float)(spclc*100)/len)+"%");
    }
}
