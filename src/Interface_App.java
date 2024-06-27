
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interface_App extends javax.swing.JFrame {

    /**
     * Creates new form Interface_App
     */
    public Interface_App() {
        initComponents();
//        this.setResizable(false);
//        Toolkit tk = Toolkit.getDefaultToolkit();
//        int xsize = (int) tk.getScreenSize().getWidth();
//         int ysize = (int) tk.getScreenSize().getHeight();
//         Insets scnmax =Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
//         int task = scnmax.bottom;
//         
//         this.setSize(xsize,ysize - task);
        setLocationRelativeTo(null);
        ImageIcon ic = new ImageIcon(this.getClass().getResource("INTER.png"));
        Image img = ic.getImage();
        Image imgsc = img.getScaledInstance(img_pill.getWidth(), img_pill.getHeight(), Image.SCALE_SMOOTH);
        img_pill.setIcon(ic);

    }

    public void close() {
        WindowEvent cwin = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(cwin);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewrem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        setrem = new javax.swing.JButton();
        history = new javax.swing.JButton();
        help = new javax.swing.JButton();
        privacy = new javax.swing.JButton();
        img_pill = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setName("f1");
        setSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewrem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewrem.setText("VIEW REMINDERS");
        viewrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewremActionPerformed(evt);
            }
        });
        getContentPane().add(viewrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 305, 57));

        jLabel1.setBackground(new java.awt.Color(0, 204, 102));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(170, 13, 13));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE REMINDER APP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 470, 60));

        setrem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        setrem.setText("SET REMINDER");
        setrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setremActionPerformed(evt);
            }
        });
        getContentPane().add(setrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 305, 57));

        history.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        history.setText("HISTORY");
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        getContentPane().add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 305, 57));

        help.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        help.setText("HELP");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        getContentPane().add(help, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, -1, -1));

        privacy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        privacy.setText("Privacy policy");
        privacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                privacyActionPerformed(evt);
            }
        });
        getContentPane().add(privacy, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));
        getContentPane().add(img_pill, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 510, 450));

        getAccessibleContext().setAccessibleName("f1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewremActionPerformed
        close();
        view_reminder v = new view_reminder();
        v.setVisible(true);
    }//GEN-LAST:event_viewremActionPerformed

    private void setremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setremActionPerformed
        close();
        setreminder s = new setreminder();
        s.setVisible(true);
    }//GEN-LAST:event_setremActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        close();
        history h = new history();
        h.setVisible(true);

    }//GEN-LAST:event_historyActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler" + " C:\\Users\\intag\\Desktop\\helpreminder.docx ");
            // Desktop.getDesktop().open(new java.io.File("C:\\Users\\intag\\Desktop"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error in opening HELP document");

        }
    }//GEN-LAST:event_helpActionPerformed

    private void privacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_privacyActionPerformed
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler" + " C:\\Users\\intag\\Desktop\\Privacyreminder.docx ");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error in opening PRIVACY document");

        }
    }//GEN-LAST:event_privacyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface_App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface_App().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton help;
    private javax.swing.JButton history;
    private javax.swing.JLabel img_pill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton privacy;
    private javax.swing.JButton setrem;
    private javax.swing.JButton viewrem;
    // End of variables declaration//GEN-END:variables
}
