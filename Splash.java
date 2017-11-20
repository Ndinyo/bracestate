
package bracestate.Splash;

import java.awt.Color;
import java.awt.Dimension;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Splash extends JFrame {

   private JLabel imglabel;
    private ImageIcon img;
    private static JProgressBar pbar;
    Thread t = null;

    public Splash() {
        super("Petro Splash");
        setSize(404, 310);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        setBackground(Color.RED);
        setLocationRelativeTo(null);
        setUndecorated(true);
        img = new ImageIcon(getClass().getResource("/bracestate/Splash/bracestate.jpg"));
        imglabel = new JLabel(img);
        add(imglabel);
        setLayout(null);
        pbar = new JProgressBar();
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setStringPainted(true);
        pbar.setForeground(Color.BLUE);
        imglabel.setBounds(0, 0, 404, 300);
        add(pbar);
        pbar.setPreferredSize(new Dimension(310, 50));
        pbar.setBounds(0, 290, 404, 20);

        Thread t = new Thread() {

            public void run() {
                int i = 0;
                while (i <= 100) {
                    pbar.setValue(i);
                    try {
                        sleep(90);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    i++;
                }
            }
        };
        t.start();
    }
}
