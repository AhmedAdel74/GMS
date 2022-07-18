package Project;

import DBConnection.ConnectionProvider;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DeleteSearch extends UpdateSearch{

//    SearchDataBase db = new SearchDataBase();
//    DataBaseVariables database = new DataBaseVariables();
    
    @Override
    public void clickSearch(Variables variables) {
        
        int checkid = 0;
        String id = variables.searchField.getText();
        try {
            db.id = id;
            database.con = ConnectionProvider.getCon();
            database.st = database.con.createStatement();
            database.rs = database.st.executeQuery(db.getDataBase());
            while (database.rs.next()) {
                checkid = 1;
                variables.nameField.setEditable(false);
                variables.nameField.setText(database.rs.getString(2));
                variables.phoneNumberField.setText(database.rs.getString(3));
                variables.phoneNumberField.setEditable(false);
                variables.endDateField.setText(database.rs.getString(5));
                variables.endDateField.setEditable(false);
                variables.genderField.setText(database.rs.getString(7));
                variables.genderField.setEditable(false);
                variables.packageField.setText(database.rs.getString(4));
                variables.packageField.setEditable(false);
                variables.ageField.setText(database.rs.getString(8));
                variables.ageField.setEditable(false);
                variables.noteField.setText(database.rs.getString(6));
                variables.noteField.setEditable(false);
            }
            if (checkid == 0) {
                JOptionPane.showMessageDialog(null, "Member ID not Exist");

            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
