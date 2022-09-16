package br.com.sandroni.store.tests;

import br.com.sandroni.store.budget.Budget;
import br.com.sandroni.store.discount.CalcDiscount;

import java.math.BigDecimal;

public class TestDiscount {

    public static void main(String[] args) {
        Budget b1 = new Budget(new BigDecimal("250"),6);
        Budget b2 = new Budget(new BigDecimal("600"),4);
        Budget b3 = new Budget(new BigDecimal("450"),2);

        CalcDiscount calc = new CalcDiscount();

        System.out.println("Desconto orçamento 1 "+calc.getDiscount(b1));
        System.out.println("Desconto orçamento 2 "+calc.getDiscount(b2));
        System.out.println("Desconto orçamento 3 "+calc.getDiscount(b3));

    }
}
