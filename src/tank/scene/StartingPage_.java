package tank.scene;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import sprite.Tank;
import util_.Direction;
import util_.Group;

import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月02日 10:19 PM
 */
public class StartingPage_ {
    public static void startingPage(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(StartingPage_.class.getResource("/OpeningScreen.fxml"));
        stage.getScene().setRoot(root);

//        Tank tank = new Tank(0,0, Group.Green, Direction.Up)
//        stage.getScene().setRoot();
    }
}
