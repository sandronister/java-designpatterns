package br.com.sandroni.store.discount;

import br.com.sandroni.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {

    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }

    protected abstract boolean IsHave(Budget budget);
    protected abstract BigDecimal calcSubClass(Budget budget);

    public BigDecimal calc(Budget budget){
        if(IsHave(budget)){
            return this.calcSubClass(budget);
        }

        return this.next.calc(budget);
    }
}
