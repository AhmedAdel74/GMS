package Project;

public class RefreshDataBase implements IDataBase{

  DataBaseVariables dbvariables = new DataBaseVariables();
    
    @Override
    public String getDataBase() {
        dbvariables.sql = "select * from member";
        return dbvariables.sql;
    }
    
}
