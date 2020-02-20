package Q10;

import java.util.Date;

public class Order {
    static int temp =1;
    private int amount;
   private int orderid;
   private Cashier cashier;
   private Date order_date;
    private  int customer_id;

    public Order(int orderid, Cashier cashier, int customer_id , int amount)
    {
        this.orderid = orderid;
        this.cashier = cashier;
        this.order_date = new Date();
        this.customer_id = customer_id;
        this.amount = amount;
    }

    public static int getTemp() {
        return temp;
    }

    public int getOrderid() {
        return orderid;
    }

    public int getAmount() {
        return amount;
    }

    public Cashier getCashier() {
        return cashier;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }
    public void placeOrder()
    {

    }
}
