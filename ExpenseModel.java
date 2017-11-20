/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracestate.Model;

/**
 *
 * @author Abi
 */
public class ExpenseModel {
    
    private double income = 0;

    public void calculateIncome(double rent, double expenseAmount) {
        income = rent - expenseAmount;
    }

    public double getCalculateIncome() {
        return income;
    }
    
}
