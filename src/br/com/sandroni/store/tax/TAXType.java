package br.com.sandroni.store.tax;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public interface TAXType {
    BigDecimal calc(Budget budget);
}
