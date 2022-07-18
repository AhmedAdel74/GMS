package Project;

import DBConnection.ConnectionProvider;
import java.awt.HeadlessException;
import static java.lang.Integer.parseInt;
import java.sql.*;
import javax.swing.JOptionPane;

public class NewMember {

    Variables memberdata = new Variables();
    DataBaseVariables database = new DataBaseVariables();
    NewMemberDataBase db = new NewMemberDataBase();

    public void clickAddMember(Variables variables) {

        memberdata.id = variables.idLabel.getText();
        memberdata.name = variables.nameField.getText();
        memberdata.number = variables.phoneNumberField.getText();
        memberdata.gender = (String) variables.genderComboBox.getSelectedItem();
        memberdata.age = variables.ageField.getText();
        memberdata.pack = (String) variables.packageComboBox.getSelectedItem();
        memberdata.note = variables.notesField.getText();
        memberdata.endDate = variables.enddateField.getText();

        try {
             database.con = ConnectionProvider.getCon();
             database.ps = database.con.prepareStatement(db.getDataBase());
             database.ps.setString(1, memberdata.id);
             database.ps.setString(2, memberdata.name);
             database.ps.setString(3, memberdata.number);
             database.ps.setString(4, memberdata.pack);
             database.ps.setString(5, memberdata.endDate);
             database.ps.setString(6, memberdata.note);
             database.ps.setString(7, memberdata.gender);
             database.ps.setString(8, memberdata.age);
             database.ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "Successfully Saved");

            variables.nameField.setText("");
            variables.phoneNumberField.setText("");
            variables.genderComboBox.setSelectedIndex(-1);
            variables.ageField.setText("");
            variables.packageComboBox.setSelectedIndex(-1);
            variables.notesField.setText("");
            variables.enddateField.setText("");
            String str1 = variables.idLabel.getText();
            int x = parseInt(str1);
            x += 1;
            variables.idLabel.setText(String.valueOf(x));
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
