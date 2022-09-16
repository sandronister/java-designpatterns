package br.com.sandroni.store.tests;

import br.com.sandroni.store.budget.Budget;
import br.com.sandroni.store.tax.ICMSTax;
import br.com.sandroni.store.tax.ISSTax;
import br.com.sandroni.store.tax.TaxCalculator;

import java.math.BigDecimal;

public class TaxTest {

    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("1000"),5);
        TaxCalculator calc = new TaxCalculator();
        System.out.println(calc.calc(budget,new ISSTax()));
        System.out.println(calc.calc(budget,new ICMSTax()));
    }
}
