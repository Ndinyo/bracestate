package bracestate.Controller;

/**
 *
 * @author Abi
 */
import bracestate.View.Accounting;
import bracestate.Model.AccountsModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AccountsController {

    private Accounting theView;
    private AccountsModel theModel;

    public AccountsController(Accounting theView, AccountsModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        //this.theView.addComputeTotalListener(new CalculateTotalRentListener());

        //this.theView.addBalanceTotalListener(new CalculateBalanceListener());
    }

    class CalculateTotalRentListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                double rent = 0;
                double water = 0;
                double garbage = 0;
                double arrears = 0;
                double other = 0;

                rent = theView.getRent();
                water = theView.getWater();
                garbage = theView.getGarbage();
                arrears = theView.getArrears();
                other = theView.getOther();

                theModel.sumRent(rent, water, garbage, arrears, other);
                theView.setExpected(theModel.getRent());

            } catch (Exception er) {
                JOptionPane.showMessageDialog(null, er.getMessage());
            }
        }
    }

    class CalculateBalanceListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                double expected = 0;
                double paid = 0;
                expected = theView.getExpected();
                paid = theView.getAmountPaid();

                theModel.sumBalance(expected, paid);
                theView.setBalance(theModel.getBalance());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
