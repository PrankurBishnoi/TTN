package Q10;

import java.util.LinkedList;
import java.util.Queue;




public class Barista

{
    public static Barista barista = new Barista();
    private Barista()
    {

    }
    String name;
    void getOrderFromOrderQueue(PendingOrderQueue poq,CompleteOrderQueue coq)
    {
        Order order = poq.pendingorderqueue.peek();
        System.out.println("Order " + order.getOrderid()+" removed from pending queue");
        poq.pendingorderqueue.remove();
        prepareCoffee(order,coq);


    }
    void prepareCoffee(Order order,CompleteOrderQueue
                       coq)
    {
        System.out.println("Cofee is being prepared for order :"+ order.getOrderid());
        completeOrder(order,coq);
    }
    void completeOrder(Order order,CompleteOrderQueue coq)
    {
        //Order temp = pendingorderqueue.peek();
            //pendingorderqueue.remove();
            coq.completeorderqueue.add(order);
        System.out.println("Order for order id :"+order.getOrderid() + "is completed");

    }

}