//(1) Write a program to demonstrate Tightly Coupled code.
package com.tothenew.demo;

public class Utility
{
    //Tight Coupling on DemoService
    DemoService demoservice = new DemoService("Dettol");

    public static void main(String[] args)
    {
        Utility util = new Utility();
        util.demoservice.showZService();
    }
}
