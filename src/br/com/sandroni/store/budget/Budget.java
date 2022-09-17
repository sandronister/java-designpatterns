package br.com.sandroni.store.budget;

import br.com.sandroni.store.budget.status.Analisys;
import br.com.sandroni.store.budget.status.BudgetStatus;

import java.math.BigDecimal;

public class Budget {

    private BigDecimal value;
    private Integer numberItems;
    private BudgetStatus status;

    public Budget(BigDecimal value, Integer numberItems) {
        this.value = value;
        this.numberItems = numberItems;
        this.status = new Analisys();
    }

    public void setExtraDiscount(){
        BigDecimal extraDiscount = this.status.calcExtraDiscount(this);
        this.value = this.value.subtract(extraDiscount);
    }

    public void aprove(){
        this.status.aprove(this);
    }

    public void reprove(){
        this.status.reprove(this);
    }

    public void finish(){
        this.status.finish(this);
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getNumberItens() {
        return numberItems;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public BudgetStatus getStatus() {
        return status;
    }
}
