package br.com.sandroni.store.discount;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class CalcDiscount {

    public BigDecimal getDiscount(Budget budget){
        Discount discount = new DiscountBudgetMoreFiveHundred(new DiscountBudgetMoreFiveItems(new NoDiscount()));
        return discount.calc(budget);
    }
}
