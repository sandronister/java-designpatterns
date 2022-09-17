package br.com.sandroni.store.order;

import br.com.sandroni.store.budget.Budget;
import br.com.sandroni.store.order.action.actionsOrder;

import java.time.LocalDateTime;
import java.util.List;

public class HandlerOrder {

    private List<actionsOrder> actions;

    public HandlerOrder(List<actionsOrder> actions) {
        this.actions = actions;
    }

    public void execute(CommandOrder command){
        Budget budget = new Budget(command.getBudgetValue(),command.getTotalItems());
        Order order  = new Order(command.getCustomer(), LocalDateTime.now(),budget);

        this.actions.forEach(a -> a.execute(order));
    }

}
