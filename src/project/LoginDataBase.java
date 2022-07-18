package Project;



public class LoginDataBase implements IDataBase{

     DataBaseVariables dbvariables = new DataBaseVariables();
    
    @Override
    public String getDataBase() {
        dbvariables.sql = "select * from admin where username = ? and password = ?";
        return dbvariables.sql;
    }
    
}
