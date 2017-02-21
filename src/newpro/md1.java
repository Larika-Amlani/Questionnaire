package newpro;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.sun.prism.paint.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class md1 {
	
    @FXML
    private TextField adname;

    @FXML
    private PasswordField adpsswd;
   
    @FXML
    private Label lab;

    @FXML
    void validate(ActionEvent event) throws Exception {
    	if(adname.getText().isEmpty()||adpsswd.getText().isEmpty())
    	{
    		lab.setText("Invalid Input");
    	}
    	else
    	{
    	String psswrd=adpsswd.getText();
    	 one f1 =new one();
    	f1.main(null);
    	String sql="SELECT psswd FROM p2 WHERE user_name='"+adname.getText()+"'";
    	PreparedStatement st=(PreparedStatement)f1.conn.prepareStatement(sql);
    	ResultSet rs=st.executeQuery(sql);
   
  
    	do
    	{
    		if(!rs.next())
    			lab.setText("No such UserName exits");
    		
    		else if(psswrd.equalsIgnoreCase(rs.getString("psswd")))
    			{
    			Alert alert2=new Alert(AlertType.CONFIRMATION,"Tabular Analysis or Graphical Analysis?");
    			alert2.setTitle("Confirmation Dialog with Custom Actions");
    			alert2.setContentText("Choose your option.");
    			ButtonType buttonTypeOne = new ButtonType("Tabular Analysis");
    			ButtonType buttonTypeTwo = new ButtonType("Graphical Analysis");
    			alert2.getButtonTypes().setAll(buttonTypeOne, buttonTypeTwo);
    			Optional<ButtonType> result = alert2.showAndWait();
    			if (result.get() == buttonTypeOne){
    				admin1.stg.hide();
    				data.main(null);
    			}
    			else if(result.get() == buttonTypeTwo)
    			{
    				showg abc=new showg();
    				admin1.stg.hide();
    				abc.start(null);
        			
    			}
    	}
    		else
    		{
    			lab.setText("Username or Password is incorrect.Try Again");
    		}
    	
    }while(rs.next());
    	}
}

}
