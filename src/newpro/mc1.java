package newpro;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class mc1{

    @FXML
    private BorderPane bdpn;

    @FXML
    void start1(ActionEvent event) throws Exception {
    	page1.stg.hide();
page2 ab=new page2();
ab.start(null); 

    }
    @FXML
    void admin(ActionEvent event) throws Exception {
      page1.stg.hide();
      admin1 ad=new admin1();
      ad.start(null);
    }

}
