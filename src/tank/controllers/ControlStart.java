package tank.controllers;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import tank.Director;

import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月02日 10:00 PM
 */
public class ControlStart {
    @FXML
    public void StartGame(MouseEvent e) throws Exception {
        Director.getInstance().gameStart();
    }

}
