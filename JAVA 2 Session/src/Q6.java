import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Q6
{

        public static void main(String[] args) {
            int a[]={10,20,30};
            System.out.println("Please enter the index at which value is to be printed in array of size 3 here");
            Scanner sc=new Scanner(System.in);
            try{
                int index=sc.nextInt();
                System.out.println(a[index]);
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please enter the valid index");
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of bound");
            }
            catch (Exception e)
            {
                System.out.println("this is ecxeption");
            }

            finally {
                System.out.println("Program terminated successfully");
            }
        }
}
