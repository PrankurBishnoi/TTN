import java.util.Scanner;

//Write the following a functional interface and implement it using lambda:
//(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
//(3) Concatination of 2 string       Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .   Parameter (String) Return (String)


@FunctionalInterface
interface GreaterThan{
    boolean check(int i1,int t2);
}


@FunctionalInterface
interface Increment{
    int increase(int i);
}


@FunctionalInterface
interface  Concat{
    String concat(String str1, String str2);

}


@FunctionalInterface
interface TOUpperCase{
    String toUppercase(String str);
}


public class Q1
{

    public static void main(String[] args)
    {
        GreaterThan obj = (i1,i2)->{
                return (i1>i2);
        };

        Increment j = (i)->{

            return (++i);
        };
        Concat c = (str1,str2)->{
            return (str1.concat(str2));
        };
        TOUpperCase obj2 = str -> {
            return (str.toUpperCase());
        };
        //Scanner s = new Scanner(System.in);

        System.out.println("Checking two nos if 10 is greater than 5 or not : " + obj.check(10,5));
        System.out.println("Incrementing the 5 gives : "+j.increase(5));
        System.out.println("Concating shivam and agarwal gives : "+c.concat("Shivam","Agarawal"));
        System.out.println("convwerting  shivam to uppercase gives : "+obj2.toUppercase("shivam"));
    }
}
