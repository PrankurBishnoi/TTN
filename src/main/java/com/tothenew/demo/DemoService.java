package com.tothenew.demo;

public class DemoService
{
    private String itemname;

    public DemoService(String itemname)
    {
        this.itemname = itemname;
    }

    public String getItemname()
    {
        return itemname;
    }

    public void setItemname(String itemname)
    {
        this.itemname = itemname;
    }

    void showZService()

    {
        //System.out.println("Hi there I am new service");
        System.out.println(" I am : "+itemname);
    }
}
