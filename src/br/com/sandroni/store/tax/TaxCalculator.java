package br.com.sandroni.store.tax;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class TaxCalculator {

    public BigDecimal calc(Budget budget,TAXType tax){
        return tax.calc(budget);
    }
}
