import java.util.EmptyStackException;
import java.util.Stack;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin()  which should return minimum element from the SpecialStack.
// (Expected complexity ­ O(1))
class SpecialStack extends Stack<Integer>
{
    //private Stack<Integer> stack ;
    private Integer  min = Integer.MAX_VALUE;
   // private Integer prevmin = Integer.MIN_VALUE;

    public SpecialStack() {
       super();
    }
    public Integer getMin()
    {
        if(this.size()==0)
                throw new EmptyStackException();
        return min;
    }

    @Override
    public Integer push(Integer item) {
        if(this.size()==0)
        {
            min = item;
            //System.out.println("Item to be pushed is : "+item+" minimum is : " +min);
            return super.push(item);
        }
       else if(item<min)
        {
            int t = (2*item)-min;
            Integer temp =  super.push(t);
           // System.out.println("In push : " + temp);
           min = item;
           // System.out.println("Item to be pushed is : "+item+" min is : " +min );
           return item;
        }
        else
        {
            return super.push(item);
        }
    }

    @Override
    public synchronized Integer pop() {

        Integer t = super.peek();
        Integer temp =  super.pop();
        if(temp == min)
            min = 2*min - t  ;
        //System.out.println("in pop : "+temp);

        return temp;

    }

    @Override
    public synchronized Integer peek() {
        Integer temp = super.peek();
        if(temp<min)
        {
            return(min);

        }
        else
            return temp;
    }
}
public class Q8
{
    public static void main(String[] args)
    {
        SpecialStack stack = new SpecialStack();
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);
        System.out.println(stack.getMin());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println("Minimum now is :" + stack.getMin());
        System.out.println(stack.pop());
        System.out.println("Minimum now is :" + stack.getMin());
        System.out.println(stack.pop());
        System.out.println("Minimum now is :" + stack.getMin());
        System.out.println(stack.pop());
      //  System.out.println("Minimum now is :" + stack.getMin());


    }
}
