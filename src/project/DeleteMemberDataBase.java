package Project;

public class DeleteMemberDataBase implements IDataBase{
   
    DataBaseVariables dbvariables = new DataBaseVariables();
    
    String id;
    
    @Override
    public String getDataBase() {
        
        dbvariables.sql = "delete from member where id = '" + id + "'";
        return dbvariables.sql;

    }
    
}
