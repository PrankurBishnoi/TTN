import java.util.Scanner;

// 7. WAP to convert seconds into days, hours, minutes and seconds.
public class Q7 {

    static void ConvertSectoDay(int n)
    {
        int day = n / (24 * 3600);

        n = n % (24 * 3600);
        int hour = n / 3600;

        n %= 3600;
        int minutes = n / 60 ;

        n %= 60;
        int seconds = n;

        System.out.println( day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the seconds");
        int n = s.nextInt();
        Q7.ConvertSectoDay(n);

    }
}
