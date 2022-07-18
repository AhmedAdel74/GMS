package Project;


public class NewMemberIdDataBase implements IDataBase {
    
 DataBaseVariables dbvariables = new DataBaseVariables();
    
 @Override
    public String getDataBase() {
        dbvariables.sql = "select max(id) from member";
        return dbvariables.sql;
    }

}
