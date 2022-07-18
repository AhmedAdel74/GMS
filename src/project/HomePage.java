package Project;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HomePage extends javax.swing.JFrame {
    
    NewMemberFrame newMember = new NewMemberFrame();
    UpdateMemberFrame updateMember = new UpdateMemberFrame();
    ViewMembersFrame viewMembers = new ViewMembersFrame();
    DeleteMemberFrame deleteMember = new DeleteMemberFrame();
    Exit exit = new Exit();

    public HomePage() {
        initComponents();  
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("Home Background.jpg"));
        Image img = icon.getImage();
        DesktopPanel = new javax.swing.JDesktopPane(){

            public void paintComponent (Graphics g)
            {
                g.drawImage(img,0,0,getWidth(),getHeight(),
                    this);
            }
        };
        MenuBar = new javax.swing.JMenuBar();
        newMemberButton = new javax.swing.JMenu();
        updateButton = new javax.swing.JMenu();
        deleteButton = new javax.swing.JMenu();
        listButton = new javax.swing.JMenu();
        exitButton = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page");
        setUndecorated(true);

        javax.swing.GroupLayout DesktopPanelLayout = new javax.swing.GroupLayout(DesktopPanel);
        DesktopPanel.setLayout(DesktopPanelLayout);
        DesktopPanelLayout.setHorizontalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        DesktopPanelLayout.setVerticalGroup(
            DesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );

        newMemberButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new membeR.png"))); // NOI18N
        newMemberButton.setText("New Member");
        newMemberButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newMemberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickNewMember(evt);
            }
        });
        MenuBar.add(newMemberButton);

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-54.png"))); // NOI18N
        updateButton.setText("Update Member");
        updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickUpdateMember(evt);
            }
        });
        MenuBar.add(updateButton);

        deleteButton.setIcon(new javax.swing.ImageIcon("D:\\Faculty\\Year 3\\Semester 2\\SA2\\Project\\GMS\\GMS\\src\\images\\deleteButton.png")); // NOI18N
        deleteButton.setText("Delete Member");
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickDeleteMember(evt);
            }
        });
        MenuBar.add(deleteButton);

        listButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listButton.png"))); // NOI18N
        listButton.setText("Members List");
        listButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickMembersList(evt);
            }
        });
        MenuBar.add(listButton);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-logout-54.png"))); // NOI18N
        exitButton.setText("Exit");
        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickExit(evt);
            }
        });
        MenuBar.add(exitButton);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesktopPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clickNewMember(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickNewMember
        updateMember.dispose();
        viewMembers.dispose();
        deleteMember.dispose();
        DesktopPanel.add(newMember).setVisible(true);
    }//GEN-LAST:event_clickNewMember

    private void clickUpdateMember(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickUpdateMember
        newMember.dispose();
        viewMembers.dispose();
        deleteMember.dispose();
        DesktopPanel.add(updateMember).setVisible(true); 
    }//GEN-LAST:event_clickUpdateMember

    private void clickMembersList(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickMembersList
        newMember.dispose();
        updateMember.dispose();
        deleteMember.dispose();
        DesktopPanel.add(viewMembers).setVisible(true);
    }//GEN-LAST:event_clickMembersList

    private void clickExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickExit
       exit.clickExit();
    }//GEN-LAST:event_clickExit

    private void clickDeleteMember(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickDeleteMember
        newMember.dispose();
        updateMember.dispose();
        viewMembers.dispose();
        DesktopPanel.add(deleteMember).setVisible(true);
    }//GEN-LAST:event_clickDeleteMember

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopPanel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu deleteButton;
    private javax.swing.JMenu exitButton;
    private javax.swing.JMenu listButton;
    private javax.swing.JMenu newMemberButton;
    private javax.swing.JMenu updateButton;
    // End of variables declaration//GEN-END:variables
}
