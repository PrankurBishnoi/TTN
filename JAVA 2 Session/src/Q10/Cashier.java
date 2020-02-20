package Q10;

enum Cashier{
    SANJAY;
   public static int takeOrder(Customer cust,PendingOrderQueue poq)
   {
      int token = (Order.temp)++;

       Order order = new Order(token,SANJAY,cust.getCust_id(),800);
       cust.getOrder().add(order);
       poq.pendingorderqueue.add(order);
       cust.setTokenno(token);
       cust.setNotify("Order Placed");
       System.out.println("Order Placed....Token No is :"+token);
       (Barista.barista).getOrderFromOrderQueue(poq,Coffeeshop.coq);
       return token;
   }


}
