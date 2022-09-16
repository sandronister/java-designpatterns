package br.com.sandroni.store.discount;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountBudgetMoreFiveItems extends Discount{

    public DiscountBudgetMoreFiveItems(Discount next) {
        super(next);
    }

    @Override
    public boolean IsHave(Budget budget) {
        return (budget.getNumberItens()>5);
    }

    @Override
    protected BigDecimal calcSubClass(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
