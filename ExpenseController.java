
package bracestate.Controller;

import bracestate.Model.ExpenseModel;
import bracestate.View.Expenditures;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Abi
 */
public class ExpenseController {
    
    private Expenditures theView;
   
    private ExpenseModel theModel;
    
    public ExpenseController(Expenditures theView, ExpenseModel theModel)
    {
        this.theView = theView;
        this.theModel = theModel;
        
        //this.theView.addIncomeListener(new CalculateIncomeListener());
    }
    
     class CalculateIncomeListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
//            try
//            {
//                double rent =0; double expensesAmount=0;
//                rent = theView.getRentPaid();
//                expensesAmount = theView.getAmountExpense();
//                
//                theModel.calculateIncome(rent, expensesAmount);
//                theView.setIncome(theModel.getCalculateIncome());
//                
//            }
//            catch(Exception ex)
//            {
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
        }
    }
    
}
