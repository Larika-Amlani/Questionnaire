package newpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class admin1 extends Application {
	public static Stage stg;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stg=new Stage();
		BorderPane p=(BorderPane)FXMLLoader.load(page2.class.getResource("admin1.fxml"));
		Scene scn=new Scene(p,725,625);
		stg.setScene(scn);
		stg.show();
		
		
	}
	public static void main(String[] args)
	{
		launch(args);
		
	}

}



