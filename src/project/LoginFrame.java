package Project;


public class LoginFrame extends javax.swing.JFrame {
    
    UserName username = new UserName();
    Password password = new Password();
    Login login = new Login();
    Exit exit = new Exit();

    public LoginFrame() {
        initComponents();
        incorrect.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JButton();
        LoginLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        LoginButton = new javax.swing.JButton();
        showPasswordBox = new javax.swing.JCheckBox();
        incorrect = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickExit(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        LoginLabel.setBackground(new java.awt.Color(2, 2, 0));
        LoginLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(0, 110, 188));
        LoginLabel.setText("LOGIN");
        getContentPane().add(LoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, 60));

        userNameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userNameField.setForeground(new java.awt.Color(0, 110, 188));
        userNameField.setText("Enter Username");
        userNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterUsername(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lostUsername(evt);
            }
        });
        getContentPane().add(userNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 260, 40));

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(0, 110, 188));
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickLogin(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 40));

        showPasswordBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showPasswordBox.setForeground(new java.awt.Color(0, 110, 188));
        showPasswordBox.setText("Show Password");
        showPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPassword(evt);
            }
        });
        getContentPane().add(showPasswordBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 140, 40));

        incorrect.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incorrect.setForeground(new java.awt.Color(255, 0, 0));
        incorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        incorrect.setText("Incorrect Username or Password");
        incorrect.setToolTipText("");
        getContentPane().add(incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 260, 30));

        passwordField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 110, 188));
        passwordField.setText("Enter Password");
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enterPassword(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lostPassword(evt);
            }
        });
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 260, 40));

        background.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login background.PNG"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 560, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkPassword(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPassword
      password.checkPassword(showPasswordBox, passwordField);
    }//GEN-LAST:event_checkPassword

    private void enterPassword(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterPassword
        password.enterPassword(incorrect, passwordField);
    }//GEN-LAST:event_enterPassword

    private void lostPassword(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lostPassword
        password.lostPassword(incorrect, passwordField);
    }//GEN-LAST:event_lostPassword

    private void enterUsername(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enterUsername
        
        username.enterUserName(incorrect,userNameField);
        
    }//GEN-LAST:event_enterUsername

    private void lostUsername(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lostUsername
         
        username.lostUserName(incorrect,userNameField);
        
    }//GEN-LAST:event_lostUsername

    private void clickExit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickExit
        
        exit.clickExit();
    }//GEN-LAST:event_clickExit

    private void clickLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickLogin

        login.incorrect = incorrect;
        login.clickLogin(userNameField, passwordField);
    }//GEN-LAST:event_clickLogin
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JLabel background;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel incorrect;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPasswordBox;
    private javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
