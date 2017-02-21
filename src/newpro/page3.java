package newpro;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;




 public class page3 extends Application
 {
public static Stage stg;
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		GridPane p=(GridPane)FXMLLoader.load(page3.class.getResource("s3.fxml"));
		stg=new Stage();
		
		Scene scn=new Scene(p,725,725);
		stg.setScene(scn);
		stg.sizeToScene();
		stg.show();
	
		
	
	}
	public static void main(String[] args){
		launch(args);
	}
	}