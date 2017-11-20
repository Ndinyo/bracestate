
package bracestate;

/**
 *
 * @author Abi
 */
public class DisplayReports extends JasperReports {

    public void showPayments() throws ClassNotFoundException {
        m_report_source = "payments.jrxml";
        m_sql_stmt = "SELECT * FROM accounts";
        showReportPayments();
    }

    public void showExpenditure() throws ClassNotFoundException {
        e_report_source = "expenditure.jrxml";
        e_sql_stmt = "SELECT * FROM expenditures";
        showReportExpenditure();
    }

}
