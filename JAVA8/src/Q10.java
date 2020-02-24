import java.util.Arrays;
import java.util.List;

//Sum all the numbers greater than 5 in the integer list.
public class Q10
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 3, 10, 12, 60, 100);
        System.out.println(list.stream().filter((i)->i>5).mapToInt(i->i).sum());
    }
}

