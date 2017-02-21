package newpro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;

public class mc9 extends one{

    @FXML
    private ToggleGroup grp1;

    @FXML
    private ToggleGroup grp3;

    @FXML
    private ToggleGroup grp2;

    @FXML
    private ToggleGroup grp4;

    @FXML
    private ToggleGroup grp6;

    @FXML
    private ToggleGroup grp5;
    
    @FXML
    private GridPane gp;

    @FXML
    void check(ActionEvent event) throws Exception {
    	flag=0;
    
    	if(grp1.getSelectedToggle()==null||grp2.getSelectedToggle()==null||grp3.getSelectedToggle()==null||grp4.getSelectedToggle()==null||grp5.getSelectedToggle()==null||grp6.getSelectedToggle()==null)
    		flag=1;
    	if(flag==1)
    	{
    		
    		Alert alert=new Alert(AlertType.INFORMATION,"You have not answered all questions.You cannot proceed further",ButtonType.OK);
    		alert.showAndWait();
 
    	}
    	else
    	{
    		page10 ab=new page10();
    		page9.stg.hide();
    		ab.start(null);
    	}
    	
    	
    	

    }

   @FXML
    void mygrp(ActionEvent event) {
	   pg7=1;
    	

    }




}
