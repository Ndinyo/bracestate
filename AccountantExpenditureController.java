package bracestate.Controller;

/**
 *
 * @author Abi
 */
import bracestate.Model.AccountantExpenditureModel;
import bracestate.View.AccountantExpenditure;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountantExpenditureController {

    private AccountantExpenditure theView;

    private AccountantExpenditureModel theModel;

    public AccountantExpenditureController(AccountantExpenditure theView, AccountantExpenditureModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
    }

    class CalculateIncomeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }
}
