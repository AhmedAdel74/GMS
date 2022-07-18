package Project;

public class ViewMembersFrame extends javax.swing.JInternalFrame {

    ViewMembers viewmembers = new ViewMembers();
    ViewMembersRefresh refresh = new ViewMembersRefresh();
    RefreshDependency dependency = new RefreshDependency(new ViewMembersRefresh());
    
    public ViewMembersFrame() {
        initComponents();
        viewmembers.ViewMembers(DataTable);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPanel = new javax.swing.JScrollPane();
        DataTable = new javax.swing.JTable();
        ListOfMembers = new javax.swing.JLabel();
        refreshButton = new javax.swing.JButton();

        setTitle("List Of Members");
        setMaximumSize(new java.awt.Dimension(1150, 710));
        setMinimumSize(new java.awt.Dimension(1150, 710));
        setPreferredSize(new java.awt.Dimension(1150, 710));
        setVisible(true);

        DataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Package", "End Date", "Note", "Gender", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DataTable.getTableHeader().setReorderingAllowed(false);
        ScrollPanel.setViewportView(DataTable);

        ListOfMembers.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ListOfMembers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/listButton.png"))); // NOI18N
        ListOfMembers.setText("List Of Members");

        refreshButton.setIcon(new javax.swing.ImageIcon("D:\\Faculty\\Year 3\\Semester 2\\SA2\\Project\\GMS\\GMS\\src\\images\\RefreshIcon.png")); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickRefresh(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(730, 738, Short.MAX_VALUE)
                    .addComponent(ListOfMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 41, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(ScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ListOfMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 604, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickRefresh(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickRefresh

        dependency.clickRefreshDependency(DataTable);
     
    }//GEN-LAST:event_clickRefresh


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DataTable;
    private javax.swing.JLabel ListOfMembers;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
