package newpro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;

public class mc8 extends one {

    @FXML
    private GridPane gp;

    @FXML
    private ToggleGroup grp1;

   
    @FXML
    private ToggleGroup grp2;

    @FXML
    void check(ActionEvent event) throws Exception {
flag=0;
        
    	if(grp1.getSelectedToggle()==null||grp2.getSelectedToggle()==null)
    		flag=1;
    	if(flag==1)
    	{
    		
    		Alert alert=new Alert(AlertType.INFORMATION,"You have not answered all questions.You cannot proceed further",ButtonType.OK);
    		alert.showAndWait();
 
    	}
    	else
    	{
    		page9 ab=new page9();
    		page8.stg.hide();
    		ab.start(null);
    	}

    }

    @FXML
    void mygrp(ActionEvent event) {
    	pg6=1;

    }

}
