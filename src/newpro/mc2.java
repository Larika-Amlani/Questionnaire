package newpro;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import java.time.temporal.ChronoUnit;

public class mc2 extends one
{
long db=0;
    @FXML
    private TextField name;

    @FXML
    private DatePicker age;

    @FXML
    void q1(ActionEvent event) throws Exception {
    	flag=0;
    	nme=name.getText();
    	LocalDate date=age.getValue();
    	LocalDate today=LocalDate.now();
    	
    	if(nme==null||date==null)
    	{
    		Alert alert1=new Alert(AlertType.INFORMATION,"You have not answered all questions.You cannot proceed further.");
    		alert1.showAndWait();
    	}
    	else if(today.compareTo(date)<=0)
    {
    		
    	Alert alert=new Alert(AlertType.INFORMATION,"DOB shoul be less than current date");
    	alert.showAndWait();
    }
    	else
    	{
    		long db=ChronoUnit.YEARS.between(date,today);
    		one.age=db;
   page3 ab=new page3();
   page2.stg.hide();
   ab.start(null);
    	}
    	
    }
}
