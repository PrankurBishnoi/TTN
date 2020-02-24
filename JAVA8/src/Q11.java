import java.util.Arrays;
import java.util.List;

//Find average of the number inside integer list after doubling it.
public class Q11
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 3, 10, 12, 60, 100);
        System.out.println(list.stream().map((i)->i*2).mapToInt(i->i).average());
    }
}
