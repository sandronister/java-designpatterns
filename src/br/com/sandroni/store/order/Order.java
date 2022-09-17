package br.com.sandroni.store.order;

import br.com.sandroni.store.budget.Budget;

import java.time.LocalDateTime;

public class Order {

    private String customer;
    private LocalDateTime data;
    private Budget budget;

    public Order(String customer, LocalDateTime data, Budget budget) {
        this.customer = customer;
        this.data = data;
        this.budget = budget;
    }

    public String getCustomer() {
        return customer;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Budget getBudget() {
        return budget;
    }
}
