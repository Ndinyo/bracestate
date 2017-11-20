
package bracestate;


import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class JasperReports {
    
    String m_where;
    String m_report_source = "/bracestate/";
    String m_sql_stmt = null;
    Map parametersMap = new HashMap();
    
    protected void showReportPayments() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Estate";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(m_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(m_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
    
    String e_where;
    String e_report_source = "/bracestate/";
    String e_sql_stmt = null;
    Map parametersExpenditureMap = new HashMap();
    
    protected void showReportExpenditure() throws ClassNotFoundException {
        try {
            String conString = "jdbc:postgresql://localhost:5432/Estate";
            String user = "postgres";
            String password = "abel";

            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(conString, user, password);

            InputStream is = getClass().getResourceAsStream(e_report_source);
            JRDesignQuery jrDesignQuery = new JRDesignQuery();
            jrDesignQuery.setText(e_sql_stmt);

            JasperDesign jasperDesign = JRXmlLoader.load(is);
            jasperDesign.setQuery(jrDesignQuery);

            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametersExpenditureMap, conn);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (SQLException | JRException exx) {
            JOptionPane.showMessageDialog(null, exx.getMessage());

        }
    }
    
}
