package newpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class page8 extends Application{
	public static Stage stg;
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stg=new Stage();
		GridPane p=(GridPane)FXMLLoader.load(page8.class.getResource("s8.fxml"));
		stg=new Stage();
		Scene scn=new Scene(p,725,425);
		stg.setScene(scn);
		stg.sizeToScene();
		stg.show();
		
	}
	public static void main(String[] args)
	{
		launch(args);
	}
	

}
