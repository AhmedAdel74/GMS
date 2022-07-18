package Project;

import DBConnection.ConnectionProvider;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ViewMembersRefresh implements IRefresh{

    RefreshDataBase db = new RefreshDataBase();
    DataBaseVariables database = new DataBaseVariables();
    
    @Override
    public void clickRefresh(javax.swing.JTable DataTable) {
        try {
            
            database.con = ConnectionProvider.getCon();
            database.ps = database.con.prepareStatement(db.getDataBase());
            database.rs = database.ps.executeQuery();
            DataTable.setModel(DbUtils.resultSetToTableModel(database.rs));
            database.ps.close();
            database.rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
