package Project;

public class UpdateMemberReset extends NewMemberReset{

    @Override
    public void clickReset(Variables variables) {
        
        variables.searchField.setText("");
        variables.nameField.setText("");
        variables.packageComboBox.setSelectedIndex(-1);
        variables.phoneNumberField.setText("");
        variables.ageField.setText("");
        variables.genderField.setText("");
        variables.packageField.setText("");
        variables.noteField.setText("");
        variables.endDateField.setText("");
    }
}
