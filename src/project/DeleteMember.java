package Project;

import DBConnection.ConnectionProvider;
import javax.swing.JOptionPane;

public class DeleteMember {

    DataBaseVariables database = new DataBaseVariables();
    DeleteMemberDataBase db = new DeleteMemberDataBase();
    
    public void clickDelete(Variables variables) {

        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Delete", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            String id = variables.searchField.getText();
            try {
                db.id = id ;
                database.con = ConnectionProvider.getCon();
                database.st = database.con.createStatement();
                database.st.executeUpdate(db.getDataBase());
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                variables.searchField.setText("");
                variables.nameField.setText("");
                variables.phoneNumberField.setText("");
                variables.endDateField.setText("");
                variables.ageField.setText("");
                variables.noteField.setText("");
                variables.genderField.setText("");
                variables.packageField.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
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
            java.util.logging.Logger.getLogger(DeleteMemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteMemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteMemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteMemberFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeleteMemberFrame().setVisible(true);
            }
        });
    }
}
