package Project;

public class UpdateMemberFrame extends javax.swing.JInternalFrame {

    UpdateSearch search = new UpdateSearch();
    UpdateMember updatemember = new UpdateMember();
    NewMemberReset resetLiskov = new UpdateMemberReset();
    PackageFactory packagefactory = new PackageFactory();
     
    Variables variables = new Variables();

    public UpdateMemberFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberIdLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        updateMemberLabel = new javax.swing.JLabel();
        packageLabel = new javax.swing.JLabel();
        packageField = new javax.swing.JTextField();
        packageComboBox = new javax.swing.JComboBox<String>();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        noteField = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        endDateField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setTitle("Update ");
        setMaximumSize(new java.awt.Dimension(1150, 710));
        setMinimumSize(new java.awt.Dimension(1150, 710));
        setPreferredSize(new java.awt.Dimension(1150, 710));
        setVisible(true);
        getContentPane().setLayout(null);

        memberIdLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        memberIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        memberIdLabel.setText("Member ID:");
        getContentPane().add(memberIdLabel);
        memberIdLabel.setBounds(9, 112, 130, 33);
        getContentPane().add(searchField);
        searchField.setBounds(148, 118, 192, 22);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-client-24.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSearch(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(380, 110, 110, 40);

        updateMemberLabel.setBackground(new java.awt.Color(72, 219, 251));
        updateMemberLabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 32)); // NOI18N
        updateMemberLabel.setForeground(new java.awt.Color(1, 163, 164));
        updateMemberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-48.png"))); // NOI18N
        updateMemberLabel.setText("Update Member");
        getContentPane().add(updateMemberLabel);
        updateMemberLabel.setBounds(720, 30, 340, 48);

        packageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        packageLabel.setForeground(new java.awt.Color(255, 255, 255));
        packageLabel.setText("Package:");
        getContentPane().add(packageLabel);
        packageLabel.setBounds(764, 210, 100, 22);

        packageField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(packageField);
        packageField.setBounds(870, 210, 107, 28);

        packageComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        packageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1M 300", "2M 550", "3M 750", "6M 1250", "1Y 2200" }));
        packageComboBox.setSelectedIndex(-1);
        packageComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                updatePackage(evt);
            }
        });
        getContentPane().add(packageComboBox);
        packageComboBox.setBounds(990, 210, 100, 28);

        nameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(nameField);
        nameField.setBounds(10, 230, 224, 28);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(10, 190, 70, 22);

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberLabel.setText("Phone Number:");
        getContentPane().add(phoneNumberLabel);
        phoneNumberLabel.setBounds(10, 280, 160, 22);

        phoneNumberField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(phoneNumberField);
        phoneNumberField.setBounds(10, 320, 224, 28);

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age:");
        getContentPane().add(ageLabel);
        ageLabel.setBounds(10, 360, 50, 22);

        ageField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(ageField);
        ageField.setBounds(10, 410, 224, 28);

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender:");
        getContentPane().add(genderLabel);
        genderLabel.setBounds(9, 481, 73, 22);

        genderField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(genderField);
        genderField.setBounds(99, 481, 134, 28);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-24.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickUpdate(evt);
            }
        });
        getContentPane().add(updateButton);
        updateButton.setBounds(118, 576, 120, 60);

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reset-24 (1).png"))); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickReset(evt);
            }
        });
        getContentPane().add(resetButton);
        resetButton.setBounds(293, 576, 120, 60);

        noteField.setColumns(20);
        noteField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(noteField);
        noteField.setBounds(790, 420, 244, 143);

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteLabel.setText("Notes:");
        getContentPane().add(noteLabel);
        noteLabel.setBounds(779, 390, 80, 22);

        endDateField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(endDateField);
        endDateField.setBounds(800, 330, 224, 28);

        endDateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        endDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        endDateLabel.setText("End Date:");
        getContentPane().add(endDateLabel);
        endDateLabel.setBounds(779, 290, 100, 22);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/victor-freitas-Yuv-iwByVRQ-unsplash_1150x710.jpg"))); // NOI18N
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1140, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickSearch(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickSearch

        variables.searchField = searchField;
        variables.ageField = ageField;
        variables.endDateField = endDateField;
        variables.genderField = genderField;
        variables.nameField = nameField;
        variables.noteField = noteField;
        variables.packageField = packageField;
        variables.phoneNumberField = phoneNumberField;
       
        search.clickSearch(variables);

    }//GEN-LAST:event_clickSearch

    private void updatePackage(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_updatePackage

        variables.endDateField = endDateField;
        variables.packageComboBox = packageComboBox;
        variables.packageField = packageField;

        IManagePackage imanagepackage = packagefactory.packageFactory(2);
        imanagepackage.managePackage(variables);  
    }//GEN-LAST:event_updatePackage

    private void clickUpdate(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickUpdate
        
        variables.searchField = searchField;
        variables.nameField = nameField;
        variables.phoneNumberField = phoneNumberField;
        variables.packageField = packageField;
        variables.endDateField = endDateField;
        variables.noteField = noteField;
        variables.genderField = genderField;
        variables.ageField = ageField;
        variables.packageComboBox = packageComboBox;
        
        updatemember.clickUpdate(variables);

    }//GEN-LAST:event_clickUpdate

    private void clickReset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickReset
  
        variables.searchField = searchField;
        variables.nameField = nameField;
        variables.packageComboBox = packageComboBox;
        variables.phoneNumberField = phoneNumberField;
        variables.ageField = ageField;
        variables.genderField = genderField;
        variables.packageField = packageField;
        variables.noteField = noteField;
        variables.endDateField = endDateField;
        
         resetLiskov.clickReset(variables);
    }//GEN-LAST:event_clickReset


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField endDateField;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel memberIdLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField noteField;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JComboBox<String> packageComboBox;
    private javax.swing.JTextField packageField;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel updateMemberLabel;
    // End of variables declaration//GEN-END:variables
}
