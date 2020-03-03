
//(2) Write a program to demonstrate Loosely Coupled code.
//(3) Use @Compenent and @Autowired annotations to in Loosely Coupled code for dependency management
//Perform Constructor Injection in a Spring Bean
package com.tothenew.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class LooseCouplingExample
{
   private DemoService demos;

   @Autowired
    public LooseCouplingExample(DemoService demos) {
        this.demos = demos;
    }

    public DemoService getDemos()
    {
        return demos;
    }

    public void setDemos(DemoService demos)
    {
        this.demos = demos;
    }
}
