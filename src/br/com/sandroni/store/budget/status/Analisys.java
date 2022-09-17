package br.com.sandroni.store.budget.status;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class Analisys extends BudgetStatus{

    @Override
    public BigDecimal calcExtraDiscount(Budget budget){
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprove(Budget budget){
        budget.setStatus(new Aprove());
    }

    @Override
    public void reprove(Budget budget){
        budget.setStatus(new Reprove());
    }
}
