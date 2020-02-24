import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Implement following functional interfaces from java.util.function using lambdas:
//
//(1) Consumer
//
//(2) Supplier
//
//(3) Predicate
//
//(4) Function
public class Q5
{
    static int a = 100;
    public static void main(String[] args)
    {
        Consumer<Integer> c = (i)->{
            System.out.println("I am consumer interface implemented by lambdas..Yhe value taken by me is :"+i);
        };
        c.accept(10);


        Supplier<Integer> s = ()->
        {
            System.out.println("I am supplier interface implemented by lambdas..Yhe value supplied by me is :"+Q5.a);
            return Q5.a;
        };
        System.out.println(s.get());

        Predicate<Integer> predicate = (i)-> (i>20);
        System.out.println("checking for integer 100 : "+ predicate.test(100));

        Function<Integer,Integer> function = (i1)->{

            return (i1*20);
        };
        System.out.println("twenty  times of  29 is  : "+ function.apply(29));
    }
}
