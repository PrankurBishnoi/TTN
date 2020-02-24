import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Collect all the even numbers from an integer list.
public class Q9
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1,3,10,12,60,100);
        System.out.println(list.stream().filter((i)->i%2==0).collect(Collectors.toList()));
    }
}
