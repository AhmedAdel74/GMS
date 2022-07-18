package Project;

public class DeleteMemberFrame extends javax.swing.JInternalFrame {

    NewMemberReset resetLiskov = new DeleteMemberReset();
//    DeleteSearch search = new DeleteSearch();
    DeleteMember deletemember = new DeleteMember();
    Variables variables = new Variables(); 
    UpdateSearch Liskov = new DeleteSearch();
    
  
    public DeleteMemberFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberIdLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        deleteMemberLabel = new javax.swing.JLabel();
        packageLabel = new javax.swing.JLabel();
        packageField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        noteField = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        endDateField = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Delete");

        memberIdLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        memberIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        memberIdLabel.setText("Member ID:");

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-client-24.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickSearch(evt);
            }
        });

        deleteMemberLabel.setBackground(new java.awt.Color(72, 219, 251));
        deleteMemberLabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 32)); // NOI18N
        deleteMemberLabel.setForeground(new java.awt.Color(1, 163, 164));
        deleteMemberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleteButton50.png"))); // NOI18N
        deleteMemberLabel.setText("Delete Member");

        packageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        packageLabel.setForeground(new java.awt.Color(255, 255, 255));
        packageLabel.setText("Package:");

        packageField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        nameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Name:");

        phoneNumberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberLabel.setText("Phone Number:");

        phoneNumberField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age:");

        ageField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender:");

        genderField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reset-24 (1).png"))); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickReset(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete-document-24.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickDelete(evt);
            }
        });

        noteField.setColumns(20);
        noteField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 255, 255));
        noteLabel.setText("Notes:");

        endDateField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        endDateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        endDateLabel.setForeground(new java.awt.Color(255, 255, 255));
        endDateLabel.setText("End Date:");

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/692037 (1).jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteMemberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(679, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(genderLabel)
                            .addGap(708, 708, 708)
                            .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(memberIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(764, 764, 764)
                            .addComponent(packageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(phoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(779, 779, 779)
                            .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(779, 779, 779)
                            .addComponent(noteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(870, 870, 870)
                            .addComponent(packageField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(800, 800, 800)
                            .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(backgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(deleteMemberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(192, 192, 192)
                            .addComponent(nameLabel)
                            .addGap(148, 148, 148)
                            .addComponent(ageLabel)
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(genderLabel))
                                .addComponent(noteField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(memberIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(packageLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(280, 280, 280)
                            .addComponent(phoneNumberLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(290, 290, 290)
                            .addComponent(endDateLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(481, 481, 481)
                            .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(390, 390, 390)
                            .addComponent(noteLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(210, 210, 210)
                            .addComponent(packageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(230, 230, 230)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(410, 410, 410)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(330, 330, 330)
                            .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(backgroundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

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
       

        Liskov.clickSearch(variables);
    }//GEN-LAST:event_clickSearch
    
    private void clickReset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickReset

        variables.ageField = ageField;
        variables.endDateField = endDateField;
        variables.genderField = genderField;
        variables.nameField = nameField;
        variables.noteField = noteField;
        variables.packageField = packageField;
        variables.phoneNumberField = phoneNumberField;
        variables.searchField = searchField;

        resetLiskov.clickReset(variables);
    }//GEN-LAST:event_clickReset

    private void clickDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickDelete

        variables.ageField = ageField;
        variables.endDateField = endDateField;
        variables.genderField = genderField;
        variables.nameField = nameField;
        variables.noteField = noteField;
        variables.packageField = packageField;
        variables.phoneNumberField = phoneNumberField;
        variables.searchField = searchField;
        
        deletemember.clickDelete(variables);
        
    }//GEN-LAST:event_clickDelete

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deleteMemberLabel;
    private javax.swing.JTextField endDateField;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JTextField genderField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel memberIdLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField noteField;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField packageField;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
