package Project;

import DBConnection.ConnectionProvider;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewMembers {
    
    ViewMembersDataBase db = new ViewMembersDataBase();
    DataBaseVariables database = new DataBaseVariables();

    public void ViewMembers(javax.swing.JTable DataTable) {
        
        try {
            database.con = ConnectionProvider.getCon();
            database.ps = database.con.prepareStatement(db.getDataBase());
            database.rs = database.ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) DataTable.getModel();

            model.setRowCount(0);

            while (database.rs.next()) {

                model.addRow(new String[]{database.rs.getString(1), database.rs.getString(2),
                    database.rs.getString(3), database.rs.getString(4), database.rs.getString(5), database.rs.getString(6),
                    database.rs.getString(7), database.rs.getString(8)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
