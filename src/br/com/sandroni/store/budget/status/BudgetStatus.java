package br.com.sandroni.store.budget.status;

import br.com.sandroni.store.DomainException;
import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public abstract  class BudgetStatus {

    public void aprove(Budget budget){
        throw new DomainException("Cannot be aprove Budget");
    }

    public void reprove(Budget budget){
        throw new DomainException("Cannot be reaprove Budget");
    }

    public void finish(Budget budget){
        throw new DomainException("Cannot be finish Budget");
    }

    public BigDecimal calcExtraDiscount(Budget budget){
        return BigDecimal.ZERO;
    }
}
