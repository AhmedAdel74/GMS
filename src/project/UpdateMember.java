package Project;

import DBConnection.ConnectionProvider;
import javax.swing.JOptionPane;

public class UpdateMember {

    Variables memberdata = new Variables();
    UpdateMemberDataBase db = new UpdateMemberDataBase();
    UpdateMemberReset reset = new UpdateMemberReset();
    DataBaseVariables database = new DataBaseVariables();

    public void clickUpdate(Variables variables) {

        memberdata.id = variables.searchField.getText();
        memberdata.name = variables.nameField.getText();
        memberdata.number = variables.phoneNumberField.getText();
        memberdata.pack = variables.packageField.getText();
        memberdata.endDate = variables.endDateField.getText();
        memberdata.note = variables.noteField.getText();
        memberdata.gender = variables.genderField.getText();
        memberdata.age = variables.ageField.getText();
        try {
            db.searchField = variables.searchField ;
            database.con = ConnectionProvider.getCon();
            database.ps = database.con.prepareStatement(db.getDataBase());

            database.ps.setString(1, memberdata.name);
            database.ps.setString(2, memberdata.number);
            database.ps.setString(3, memberdata.pack);
            database.ps.setString(4, memberdata.endDate);
            database.ps.setString(5, memberdata.note);
            database.ps.setString(6, memberdata.gender);
            database.ps.setString(7, memberdata.age);
            database.ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            
            reset.clickReset(variables);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
