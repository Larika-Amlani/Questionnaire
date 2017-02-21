package newpro;

import java.io.File;
import java.net.URI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class result extends Application {
public static String u="";
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
		
		final int numCols=1;
		final int numRows=2;
		Stage stg=new Stage();
		BorderPane p=(BorderPane)FXMLLoader.load(result.class.getResource("rest.fxml"));
		GridPane pl=new GridPane();
		 for (int i = 0; i < numCols; i++) {
	            ColumnConstraints colConst = new ColumnConstraints();
	            colConst.setPercentWidth(387.00 / numCols);
	            pl.getColumnConstraints().add(colConst);
	        }
	        for (int i = 0; i < numRows; i++) {
	            RowConstraints rowConst = new RowConstraints();
	            rowConst.setPercentHeight(721.00 / numRows);
	            pl.getRowConstraints().add(rowConst); }
	       String abc=res.find_disease();
	     
	        Hyperlink disease=new Hyperlink(abc);
	        //disease.setStyle("-fx-text-fill: black;");
	        disease.setFont(new Font("Jokerman",25));
	       
	       disease.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent e) {
                	getHostServices().showDocument(u);
                	
                }
            });
	        
	    pl.add(disease,0,0);
	    File file = new File("C:/Users/Larika/workspace/newpro/src/newpro/Picture1.png");
        Image image = new Image(file.toURI().toString());
        ImageView img = new ImageView(image);
       
        Label lbl=new Label("Thank you!");
        lbl.setFont(new Font("Bodoni MT Poster Compressed",60));
     lbl.setAlignment(Pos.CENTER);
     
	    AnchorPane stk=new AnchorPane();
	    stk.setPrefSize(722,301);
	  AnchorPane.setTopAnchor(lbl,0195.00);
	  AnchorPane.setLeftAnchor(lbl,295.00);
	    AnchorPane.setTopAnchor(img,00.00);
	   AnchorPane.setLeftAnchor(img,250.00);
	  /* AnchorPane.setRightAnchor(img,0.00);*/
	  AnchorPane.setBottomAnchor(img,20.00);
	    stk.getChildren().addAll(img,lbl);
	    
	  pl.add(stk,0,1);
	      p.setCenter(pl);
		Scene scn=new Scene(p,725,575);
		
		stg.setScene(scn);
		stg.sizeToScene();
		stg.show();
		
	
	}
	public static void main(String[] args)
	{
		//res.find_disease();
		launch(args);
	
	}

}
