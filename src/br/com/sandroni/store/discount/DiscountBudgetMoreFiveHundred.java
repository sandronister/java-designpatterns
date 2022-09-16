package br.com.sandroni.store.discount;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountBudgetMoreFiveHundred extends Discount{

    public DiscountBudgetMoreFiveHundred(Discount next) {
        super(next);
    }

    @Override
    protected boolean IsHave(Budget budget) {
        return (budget.getValue().compareTo(new BigDecimal("500"))>0);
    }

    @Override
    protected BigDecimal calcSubClass(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.5"));
    }
}
