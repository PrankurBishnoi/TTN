package com.company;


enum House{

    AGARWALS_HOUSE(20000000), SHARMAS_HOUSE(50000000), SHUKLAS_HOUSE(8000000), KHANNAS_HOUSE(80000000);
    int price;
    House(int price)
    {
        this.price = price;
    }
    int getprice()
    {
        return (this.price);
    }

}
public class Q9
{
    public static void main(String[] args)

    {
        House [] house = House.values();
        for(House temp :house)
        {
            System.out.println("price of "+ temp +" is :"+temp.getprice());
        }

    }

}
