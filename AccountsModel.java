
package bracestate.Model;

/**
 *
 * @author Abi
 */
public class AccountsModel {

    private double totalAmount = 0;

    public void sumRent(double rent, double water, double garbage, double arrears, double other) {
        totalAmount = rent + water + garbage + arrears + other;
    }

    public double getRent() {
        return totalAmount;
    }

    private double balance = 0;

    public void sumBalance(double expected, double paid) {
        balance = expected - paid;
    }

    public double getBalance() {
        return balance;
    }
}
