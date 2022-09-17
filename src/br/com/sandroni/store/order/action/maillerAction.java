package br.com.sandroni.store.order.action;

import br.com.sandroni.store.order.Order;

public class maillerAction implements actionsOrder {

    public void execute(Order order){
        System.out.println("Send mail new Order");
    }
}
