public class Q4
{	//WAP to create singleton class.
    public static final Q4 instance = new Q4();
    int i;
    private Q4()
    {

    }
    public static Q4 getInstanceOf()
    {
        return instance;
    }

    public static void main(String[] args)
    {
        Q4 obj1 = Q4.getInstanceOf();
        obj1.i =20;
        System.out.println("Value iof i through obj1 :"+obj1.i);
        Q4 obj2 = Q4.getInstanceOf();
        System.out.println("Value iof i thorough obj2:"+obj2.i);


    }
}
