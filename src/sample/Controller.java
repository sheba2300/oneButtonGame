//Sheba Sow
package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class Controller {
    @FXML
    private Button yellow;
    public void pressButton()
    {
        yellow.setOpacity(.5);
    }
}
