package br.com.sandroni.store.budget.status;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class Aprove extends BudgetStatus{

    public BigDecimal calcExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finish(Budget budget) {
        budget.setStatus(new Finish());
    }
}
