package newpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class page7 extends Application{
	public static Stage stg;

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		stg=new Stage();
		GridPane p=(GridPane)FXMLLoader.load(page7.class.getResource("s7.fxml"));
		stg=new Stage();
		Scene scn=new Scene(p,725,625);
		stg.setScene(scn);
		stg.sizeToScene();
		stg.show();
	}

}
