package com.company;

public class Q11
{
    public static void main(String[] args)
    {
        Banks sbi = new SBI(7.9);
        Banks boi = new BOI(10.0);
        Banks icici = new ICICI(5);
        System.out.println("\nThe SBI Bank details are : ");
        sbi.getDetails();
        System.out.println("\nThe BOI Bank details are : ");
        boi.getDetails();
        System.out.println("\nThe ICICI Bank details are : ");
        icici.getDetails();
    }
}
class Banks
{
    private double interestrate;


    public Banks(double interestrate)
    {
        this.interestrate = interestrate;

    }



    public double getInterestrate()
    {
        return interestrate;
    }



    void getDetails()
    {

    }

}
class SBI extends Banks
{
    static String bankname="State Bank Of India(SBI)";
    public SBI(double interestrate)
    {
        super(interestrate);
    }


    void getDetails()
    {

        System.out.println("Bank Name : "+ SBI.bankname);
        System.out.println("Interest Rate is : "+this.getInterestrate());

    }
}
class BOI extends Banks
{
    static String bankname = "Bank Of India(BOI)";
    public BOI(double interestrate) {

        super(interestrate);
    }

    void getDetails()
    {

        System.out.println("Bank Name : "+BOI.bankname);
        System.out.println("Interest Rate is : "+this.getInterestrate());

    }
}
class ICICI extends Banks
{
    static String bankname = " Industrial Credit and Investment Corporation of India(ICICI)";
    public ICICI(double interestrate)
    {
        super(interestrate);
    }

    void getDetails()
    {
        System.out.println("Bank Name : "+ICICI.bankname);
        System.out.println("Interest Rate is : "+this.getInterestrate());

    }
}