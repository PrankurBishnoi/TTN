package com.company;

public class Q7
{
    static String fname = "Shivam";
    static String lname= "Agarwal";
    static int age=21;

    static{
        System.out.println("\nInside static block");
        System.out.println("First Name is:"+fname);
        System.out.println("last Name is:"+lname);
        System.out.println("Age is:"+age);

    }
    static void print()
    {
        System.out.println("\nInside static method");
        System.out.println("First Name is:"+fname);
        System.out.println("last Name is:"+lname);
        System.out.println("Age is:"+age);
    }
    public static void main(String[] args)
    {

        System.out.println("\nUsing Variables");
        System.out.println("First Name is:"+fname);
        System.out.println("last Name is:"+lname);
        System.out.println("Age is:"+age);
        Q7.print();
    }
}
