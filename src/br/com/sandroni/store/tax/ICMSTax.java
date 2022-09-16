package br.com.sandroni.store.tax;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class ICMSTax implements TAXType {

    @Override
    public BigDecimal calc(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
}
