package Project;

import javax.swing.JOptionPane;
import DBConnection.ConnectionProvider;

public class Login extends javax.swing.JFrame{

    LoginDataBase db = new LoginDataBase();
    DataBaseVariables database = new DataBaseVariables();
   
    public javax.swing.JLabel incorrect;
    

    public void clickLogin(javax.swing.JTextField userNameField, javax.swing.JPasswordField passwordField) {
        incorrect.setVisible(false);
        database.con = ConnectionProvider.getCon();

        try {
            database.ps = database.con.prepareStatement(db.getDataBase());
            database.ps.setString(1, userNameField.getText());
            database.ps.setString(2, passwordField.getText());
            database.rs = database.ps.executeQuery();
            if (database.rs.next()) {
                
                new HomePage().setVisible(true);

            } else {
                
                 incorrect.setVisible(true);  
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
                
            }
        });
    }
}
