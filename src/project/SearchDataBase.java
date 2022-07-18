package Project;

public class SearchDataBase implements IDataBase{

    DataBaseVariables dbvariables = new DataBaseVariables();
    String id;
    
    @Override
    public String getDataBase() {
        dbvariables.sql = "select * from member where id = " + id + " ";
        return dbvariables.sql;
    }
    
}
