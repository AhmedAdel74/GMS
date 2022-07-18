package Project;


public class DeleteMemberReset extends NewMemberReset{

    @Override
    public void clickReset(Variables variables) {
        
        variables.searchField.setText("");
        variables.nameField.setText("");
        variables.phoneNumberField.setText("");
        variables.ageField.setText("");
        variables.genderField.setText("");
        variables.packageField.setText("");
        variables.noteField.setText("");
        variables.endDateField.setText("");

    }
    
}
