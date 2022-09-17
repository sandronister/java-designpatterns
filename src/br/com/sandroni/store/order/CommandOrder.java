package br.com.sandroni.store.order;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CommandOrder {

    private String customer;
    private BigDecimal budgetValue;
    private int totalItems;

    public CommandOrder(String customer, BigDecimal budgetValue, int totalItems) {
        this.customer = customer;
        this.budgetValue = budgetValue;
        this.totalItems = totalItems;
    }

    public String getCustomer() {
        return customer;
    }

    public BigDecimal getBudgetValue() {
        return budgetValue;
    }

    public int getTotalItems() {
        return totalItems;
    }
}
