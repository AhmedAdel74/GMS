package Project;


public class ViewMembersDataBase implements IDataBase{

       DataBaseVariables dbvariables = new DataBaseVariables();
    
    @Override
    public String getDataBase() {
       
        dbvariables.sql = "SELECT * from member";
        return dbvariables.sql;
    }
    
}
