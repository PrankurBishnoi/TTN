package com.company;

import java.util.Scanner;

public class Q8
{
    public static void main(String[] args)
    {

            Scanner s = new Scanner(System.in);
        System.out.println("Enter the String :");
            String str = s.nextLine();
            int len = str.length();
            StringBuffer strbuf = new StringBuffer(str);
            strbuf.reverse();
        System.out.println("Reversed String is :" + strbuf);
        System.out.println("String after replacing character from index 4 to index 9 by empty string is : "+strbuf.replace(4,10,""));

    }

}
