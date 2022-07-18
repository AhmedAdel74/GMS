package Project;

import java.awt.Color;
public class Password {
    
     public void checkPassword(javax.swing.JCheckBox showPasswordBox, javax.swing.JPasswordField passwordField) {                               
        if(showPasswordBox.isSelected()){
            passwordField.setEchoChar((char)0);
        }else{
            passwordField.setEchoChar('*');
        }
    }                              

    public void enterPassword(javax.swing.JLabel incorrect, javax.swing.JPasswordField passwordField) {                               
        incorrect.setVisible(false);
        if(passwordField.getText().equals("Enter Password")){
            passwordField.setText("");
            passwordField.setForeground(new Color(0,118,221));
        }
    }                              

    public void lostPassword(javax.swing.JLabel incorrect, javax.swing.JPasswordField passwordField) {                              
        incorrect.setVisible(false);
        if(passwordField.getText().equals("")){
            passwordField.setText("Enter Password");
            passwordField.setForeground(new Color(0,118,221));
        }
    }       
}
