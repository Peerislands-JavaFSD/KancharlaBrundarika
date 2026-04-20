package org.payrollsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PayrollProcessor{
    private final TaxCalculator taxCalculator;
    private BonusScheme bonusScheme;



    @Autowired
    public PayrollProcessor(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    @Autowired
    public void setBonusScheme(BonusScheme bonusScheme){
        this.bonusScheme = bonusScheme;
    }

    public void processSalary(String employeeName, double grossSalary) {
        double tax = taxCalculator.calculateTax(grossSalary);
        double net = grossSalary - tax;
        System.out.println("Employee: " + employeeName);
        System.out.println("Gross: " + grossSalary + " Tax: " + tax + " Net: " + net);
    }

    public void processWithBonus(String employeeName, double salary) {
        processSalary(employeeName, salary);
        if (bonusScheme != null) {
            double bonus = bonusScheme.calculateBonus(salary);
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus scheme");
        }
    }
}