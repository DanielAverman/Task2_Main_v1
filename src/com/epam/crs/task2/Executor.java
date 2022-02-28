package com.epam.crs.task2;

import com.epam.crs.parsing.ExpressionCalculator;

public class Executor {

    public static void main(String[] args) {
        ExpressionCalculator expCalc = new ExpressionCalculator();
        String[] testExpressions = {
                "2+2*2",
                "qwe",
                "2          +(2+2)*      2",
                "2q-211",
                "22*(2+8*(5-4))"
        };
        for (String expr : testExpressions){
            try {
                System.out.println("Result for '" + expr + "' = " + expCalc.calculate(expr));
            } catch (Exception ex) {
                System.out.println("'" + expr + "' has errors. " + ex.getMessage());
            }
        }
    }
}
