package br.com.sandroni.store.budget.status;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class Reprove extends BudgetStatus {

    @Override
    public void finish(Budget budget) {
        budget.setStatus(new Finish());
    }
}
