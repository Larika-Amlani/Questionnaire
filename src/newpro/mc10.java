package newpro;

import java.sql.PreparedStatement;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class mc10 extends one{

    @FXML
    private ToggleGroup grp1;

    @FXML
    private ToggleGroup grp3;

    @FXML
    private ToggleGroup grp2;

    @FXML
    private ToggleGroup grp4;

    

    @FXML
    private ToggleGroup grp5;
    
    @FXML
    private GridPane gp;

    @FXML
    void check(ActionEvent event) throws Exception {
    	flag=0;
     
    	if(grp1.getSelectedToggle()==null||grp2.getSelectedToggle()==null||grp3.getSelectedToggle()==null||grp4.getSelectedToggle()==null||grp5.getSelectedToggle()==null)
    		flag=1;
    	if(flag==1)
    	{
    		
    		Alert alert=new Alert(AlertType.INFORMATION,"You have not answered all questions.You cannot proceed further",ButtonType.OK);
    		alert.showAndWait();
 
    	}
    	else
    	{
    		
    		one f1=new one();
    		f1.main(null);
    		String sql = "INSERT INTo p1(name,age,pg1,pg2,pg3,pg4,pg5,pg6,pg7) values (?,?,?,?,?,?,?,?,?)";
		    PreparedStatement statement = (PreparedStatement) f1.conn.prepareStatement(sql);
		    statement.setString(1,nme);
		    statement.setLong(2,age);
		    statement.setInt(3,pg1);
		    statement.setInt(4,pg2);
		    statement.setInt(5,pg3);
		    statement.setInt(6,pg4);
		    statement.setInt(7,pg5);
		    statement.setInt(8,pg6);
		    statement.setInt(9,pg7);
		    statement.executeUpdate();
    		result ab=new result();
    		page10.stg.hide();
    		ab.start(null);
    	}
    	
    	
    	

    }

   @FXML
    void mygrp(ActionEvent event) {
	   pg7=1;
    	

    }




}
