package Project;

public class NewMemberDataBase implements IDataBase {

    DataBaseVariables dbvariables = new DataBaseVariables();
  
    
    @Override
    public String getDataBase() {
         dbvariables.sql = "insert into member values" + " (?,?,?,?,?,?,?,?)";
        return  dbvariables.sql;
    }
    
}
