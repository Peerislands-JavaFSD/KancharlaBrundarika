package org.payrollsystem;

import org.payrollsystem.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        PayrollProcessor processor = context.getBean(PayrollProcessor.class);
        processor.processWithBonus("Arun", 80000);
    }
}
