package br.com.sandroni.store.order.action;

import br.com.sandroni.store.order.Order;

public class saverAction implements actionsOrder {

    public void execute(Order order){
        System.out.println("Order save BD");
    }

}
