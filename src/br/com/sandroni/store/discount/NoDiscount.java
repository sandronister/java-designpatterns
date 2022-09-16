package br.com.sandroni.store.discount;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public class NoDiscount extends Discount{

    public NoDiscount() {
        super(null);
    }

    @Override
    public boolean IsHave(Budget budget) {
        return true;
    }

    @Override
    protected BigDecimal calcSubClass(Budget budget) {
        return BigDecimal.ZERO;
    }
}
