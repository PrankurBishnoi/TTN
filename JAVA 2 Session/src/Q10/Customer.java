package Q10;

import java.util.ArrayList;
import java.util.List;

public class Customer
{
    static int temp=1;
  private  int cust_id;
   private String Customername;
    private List<Order> orders;
    private String notify;
    private int tokenno;

    public Customer(String customername, List<Order> order)
    {
        this.cust_id = temp++;
        this.Customername = customername;
        this.orders = order;
        this.notify="";

    }

    public int getCust_id() {
        return cust_id;
    }

    public String getCustomername() {
        return Customername;
    }

    public List<Order> getOrder() {
        return orders;
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public void setTokenno(int tokenno) {
        this.tokenno = tokenno;
    }

    public int placeOrder(PendingOrderQueue poq)
    {
        int t=0;
        t = Cashier.takeOrder(this,poq);
        this.tokenno = t;


        return t;
    }

    public void waitForOrder(int token)
    {
        System.out.println("Customer of id "+ this.getCust_id()+" is waiting with token no :"+ token);
    }
}
