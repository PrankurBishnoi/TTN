public class Q2
{
    public static void main(String[] args)
    {
// WAP to produce ClassNotFoundException exception.
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
