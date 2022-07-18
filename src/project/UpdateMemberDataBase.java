package Project;

public class UpdateMemberDataBase implements IDataBase{

    Variables memberdata = new Variables();
    DataBaseVariables dbvariables = new DataBaseVariables();
    
    public javax.swing.JTextField searchField;
    
    @Override
    public String getDataBase() {
        
        memberdata.id = searchField.getText();

        dbvariables.sql = "update member set Name=?, Number=?, Package =?,EndDate =? , Note =?, Gender=?, Age = ? WHERE id=" + memberdata.id + "";
        return dbvariables.sql;

    }
    
}
