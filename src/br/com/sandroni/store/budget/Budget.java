package br.com.sandroni.store.budget;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private Integer numberItems;

    public Budget(BigDecimal value, Integer numberItems) {
        this.value = value;
        this.numberItems = numberItems;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getNumberItens() {
        return numberItems;
    }
}
