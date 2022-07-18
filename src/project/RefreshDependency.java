package Project;

public class RefreshDependency {
    public IRefresh RefreshDependency;
 
    public RefreshDependency(IRefresh _RefreshDependency){
        RefreshDependency = _RefreshDependency;
    }
    
   public void clickRefreshDependency(javax.swing.JTable DataTable){
     RefreshDependency.clickRefresh(DataTable);
   }
}
