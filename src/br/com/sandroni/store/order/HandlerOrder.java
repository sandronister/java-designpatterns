package br.com.sandroni.store.order;

import br.com.sandroni.store.budget.Budget;

import java.time.LocalDateTime;

public class HandlerOrder {

    public void execute(CommandOrder command){
        Budget budget = new Budget(command.getBudgetValue(),command.getTotalItems());
        Order order  = new Order(command.getCustomer(), LocalDateTime.now(),budget);

        System.out.println("Order save BD");
        System.out.println("Send mail new Order");
    }

}
