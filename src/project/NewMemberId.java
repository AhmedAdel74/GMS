package Project;

import DBConnection.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

public class NewMemberId {

    NewMemberIdDataBase db = new NewMemberIdDataBase();
    DataBaseVariables database = new DataBaseVariables();
    public void calculateId(javax.swing.JLabel idLabel) {
        try {
            int id = 1;
            String str1 = String.valueOf(id);
            idLabel.setText(str1);
            database.con = ConnectionProvider.getCon();
            Statement st = database.con.createStatement();
            database.rs = st.executeQuery(db.getDataBase());
            while (database.rs.next()) {
                id = database.rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                idLabel.setText(str);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
