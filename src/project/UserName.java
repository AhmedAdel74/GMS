package Project;

import java.awt.Color;

public class UserName {
    
    public void enterUserName(javax.swing.JLabel incorrect,javax.swing.JTextField userNameField ) {                               
        incorrect.setVisible(false);
        if(userNameField.getText().equals("Enter Username")){
            userNameField.setText("");
            userNameField.setForeground(new Color(0,118,221));
        }
    }                              

    public void lostUserName(javax.swing.JLabel incorrect,javax.swing.JTextField userNameField) {                              
       incorrect.setVisible(false);
        if(userNameField.getText().equals("")){
            userNameField.setText("Enter Username");
            userNameField.setForeground(new Color(0,118,221));
        }
    }                                                           
}


