package Project;

import javax.swing.JOptionPane;

public class Exit {
    
     public void clickExit() {                           
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to exit","Select",JOptionPane.YES_NO_OPTION);
        if(a == 0){
            System.exit(0);
        }
    }  
}
