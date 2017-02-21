package newpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class page1 extends Application {
	public static Stage stg;
	
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stg=new Stage();
		BorderPane p=(BorderPane)FXMLLoader.load(page1.class.getResource("s1.fxml"));
		Scene scn=new Scene(p,625,625);
		//scn.getStylesheets().addAll(this.getClass().getResource("s.css").toExternalForm());
		stg.setScene(scn);
		stg.show();
	}

}
