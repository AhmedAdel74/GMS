package Project;

public class NewMemberReset {

   
    public void clickReset(Variables variables) {
        
        variables.nameField.setText("");
        variables.phoneNumberField.setText("");
        variables.genderComboBox.setSelectedIndex(-1);
        variables.ageField.setText("");
        variables.packageComboBox.setSelectedIndex(-1);
        variables.notesField.setText("");
        variables.enddateField.setText("");

    }
    
}
