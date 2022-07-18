package Project;

public class NewMemberFrame extends javax.swing.JInternalFrame {

    NewMember newmember = new NewMember();
    NewMemberId newmemberid = new NewMemberId();
    NewMemberReset reset = new NewMemberReset();
    PackageFactory packagefactory = new PackageFactory();
    Variables variables = new Variables();
   
    public NewMemberFrame() {
        initComponents();
        newmemberid.calculateId(idLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memberIdLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        newMemberLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        packageComboBox = new javax.swing.JComboBox<String>();
        nameLabel = new javax.swing.JLabel();
        packageLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<String>();
        ageLabel = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        endDateLabel = new javax.swing.JLabel();
        endDateField = new javax.swing.JFormattedTextField();
        ScrollPanel = new javax.swing.JScrollPane();
        noteField = new javax.swing.JTextArea();
        noteLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setClosable(true);
        setTitle("NewMember");
        setMinimumSize(new java.awt.Dimension(1150, 710));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1150, 710));
        setVisible(true);
        getContentPane().setLayout(null);

        memberIdLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        memberIdLabel.setText("Member ID:");
        getContentPane().add(memberIdLabel);
        memberIdLabel.setBounds(10, 63, 109, 22);

        idLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idLabel.setText("00");
        getContentPane().add(idLabel);
        idLabel.setBounds(137, 63, 128, 22);

        newMemberLabel.setBackground(new java.awt.Color(72, 219, 251));
        newMemberLabel.setFont(new java.awt.Font("Berlin Sans FB", 1, 32)); // NOI18N
        newMemberLabel.setForeground(new java.awt.Color(1, 163, 164));
        newMemberLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new membeR.png"))); // NOI18N
        newMemberLabel.setText("NEW MEMBER");
        getContentPane().add(newMemberLabel);
        newMemberLabel.setBounds(696, 29, 280, 56);

        nameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(nameField);
        nameField.setBounds(10, 164, 347, 40);

        packageComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        packageComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1M 350", "2M 550", "3M 750", "6M 1250", "1Y 2200" }));
        packageComboBox.setSelectedIndex(-1);
        packageComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                addPackage(evt);
            }
        });
        getContentPane().add(packageComboBox);
        packageComboBox.setBounds(580, 164, 348, 30);

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setText("Name");
        getContentPane().add(nameLabel);
        nameLabel.setBounds(10, 124, 347, 22);

        packageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        packageLabel.setText("Package");
        getContentPane().add(packageLabel);
        packageLabel.setBounds(580, 124, 348, 22);

        phoneNumberField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(phoneNumberField);
        phoneNumberField.setBounds(10, 261, 347, 40);

        numberLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numberLabel.setText("Phone Number");
        getContentPane().add(numberLabel);
        numberLabel.setBounds(10, 221, 347, 22);

        genderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderLabel.setText("Gender");
        getContentPane().add(genderLabel);
        genderLabel.setBounds(10, 316, 347, 22);

        genderComboBox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        genderComboBox.setSelectedIndex(-1);
        getContentPane().add(genderComboBox);
        genderComboBox.setBounds(10, 356, 347, 40);

        ageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageLabel.setText("Age");
        getContentPane().add(ageLabel);
        ageLabel.setBounds(10, 418, 347, 22);

        ageField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(ageField);
        ageField.setBounds(10, 450, 350, 40);

        addButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon("D:\\Faculty\\Year 3\\Semester 2\\SA2\\Project\\GMS\\GMS\\src\\images\\addMember.png")); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickAddMember(evt);
            }
        });
        getContentPane().add(addButton);
        addButton.setBounds(170, 540, 120, 60);

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon("D:\\Faculty\\Year 3\\Semester 2\\SA2\\Project\\GMS\\GMS\\src\\images\\ClearIcon.png")); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickReset(evt);
            }
        });
        getContentPane().add(ClearButton);
        ClearButton.setBounds(330, 540, 120, 60);

        endDateLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        endDateLabel.setText("End Date");
        getContentPane().add(endDateLabel);
        endDateLabel.setBounds(580, 229, 348, 22);

        endDateField.setEditable(false);
        endDateField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yy"))));
        endDateField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(endDateField);
        endDateField.setBounds(580, 269, 348, 40);

        noteField.setColumns(20);
        noteField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noteField.setLineWrap(true);
        noteField.setRows(5);
        ScrollPanel.setViewportView(noteField);

        getContentPane().add(ScrollPanel);
        ScrollPanel.setBounds(580, 379, 348, 117);

        noteLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        noteLabel.setText("Notes");
        getContentPane().add(noteLabel);
        noteLabel.setBounds(580, 339, 348, 22);

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym-wallpaper-full-hd-1920x1080-301982.jpg"))); // NOI18N
        backgroundLabel.setMaximumSize(new java.awt.Dimension(1150, 710));
        backgroundLabel.setMinimumSize(new java.awt.Dimension(1150, 710));
        backgroundLabel.setPreferredSize(null);
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1140, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickAddMember(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickAddMember

        variables.ageField = ageField;
        variables.enddateField = endDateField;
        variables.genderComboBox = genderComboBox;
        variables.idLabel = idLabel;
        variables.nameField = nameField;
        variables.notesField = noteField;
        variables.packageComboBox = packageComboBox;
        variables.phoneNumberField = phoneNumberField;
        
        newmember.clickAddMember(variables);
    }//GEN-LAST:event_clickAddMember

    private void clickReset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickReset

        variables.nameField = nameField;
        variables.phoneNumberField = phoneNumberField;
        variables.genderComboBox = genderComboBox;
        variables.ageField = ageField;
        variables.packageComboBox = packageComboBox;
        variables.notesField = noteField;
        variables.enddateField = endDateField;

        reset.clickReset(variables);
        
    }//GEN-LAST:event_clickReset

    private void addPackage(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_addPackage
  
        variables.enddateField = endDateField;
        variables.packageComboBox = packageComboBox;
        IManagePackage imanagepackage = packagefactory.packageFactory(1);
        imanagepackage.managePackage(variables);
        
    }//GEN-LAST:event_addPackage


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JFormattedTextField endDateField;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel memberIdLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel newMemberLabel;
    private javax.swing.JTextArea noteField;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JComboBox<String> packageComboBox;
    private javax.swing.JLabel packageLabel;
    private javax.swing.JTextField phoneNumberField;
    // End of variables declaration//GEN-END:variables

}
