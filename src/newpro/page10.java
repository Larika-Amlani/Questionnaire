package newpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class page10 extends Application
{public static Stage stg;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		GridPane p=(GridPane)FXMLLoader.load(page10.class.getResource("s10.fxml"));
		stg=new Stage();
		Scene scn=new Scene(p,725,725);
		stg.setScene(scn);
		stg.sizeToScene();
		stg.show();
	}
	public static void main(String[] args)
	{
		launch(args);
	}
	

}
