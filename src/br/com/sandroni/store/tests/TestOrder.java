package br.com.sandroni.store.tests;

import br.com.sandroni.store.budget.Budget;
import br.com.sandroni.store.order.CommandOrder;
import br.com.sandroni.store.order.HandlerOrder;
import br.com.sandroni.store.order.Order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestOrder {

    public static void main(String[] args) {
        CommandOrder command = new CommandOrder("Joao Silva",new BigDecimal("1200"),6);
        HandlerOrder handler = new HandlerOrder();
        handler.execute(command);
    }
}
