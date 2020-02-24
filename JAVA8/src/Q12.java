////Find the first even number in the integer list which is greater than 3.
import java.util.Arrays;
import java.util.List;


public class Q12
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 3, 10, 12, 60, 100);
        System.out.println(
                list.stream().
                        filter(i->{
                            System.out.println("Inside filter : "+ i);
                            return (i%2==0);
                        }).
                        findFirst()

        );
    }
}
