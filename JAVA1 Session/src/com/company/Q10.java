package com.company;

import java.util.Scanner;

public class Q10
{
    int sum(int a,int b)
    {
        return (a+b);
    }
    double sum(double a,double b)
    {
        return (a+b);
    }
    int multiply(int a,int b)
    {
        return (a*b);
    }
    double multiply(double a,double b)
    {
        return (a*b);
    }
    String conactstrings(String a,String b)
    {
        return(a+b);
    }
    String conactstrings(String a,String b,String c)
    {
        return(a+b+c);
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Q10 obj = new Q10();
        int a,b;
        double c,d;
        String str1,str2,str3;
        System.out.println("Enter two integers:");
        a=s.nextInt();
        b = s.nextInt();
        System.out.println("Addition is : "+obj.sum(a,b));
        System.out.println("Product is : "+obj.multiply(a,b));
        System.out.println("Enter two real nos : ");
        c = s.nextDouble();
        d=s.nextDouble();
        System.out.println("Addition is : "+obj.sum(c,d));
        System.out.println("Product is : "+obj.multiply(c,d));
        s.nextLine();
        System.out.println("Enter String 1 : ");
        str1 = s.nextLine();
        System.out.println("Enter String 2 : ");
        str2 = s.nextLine();
        System.out.println("Enter String 3 : ");
        str3 = s.nextLine();
        System.out.println("Concatenation of string 1 & string 2 : "+obj.conactstrings(str1,str2));
        System.out.println("Concatenation of string 1 & string 2 & string 3: "+obj.conactstrings(str1,str2,str3));



    }
}
