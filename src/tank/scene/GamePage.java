package tank.scene;

import javafx.animation.AnimationTimer;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import sprite.Tank;
import util_.Direction;
import util_.Group;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月02日 10:51 PM
 */
public class GamePage {
    private AnchorPane root;

    //to create an inside class to listen the key event
    private KeyProcess keyProcess = new KeyProcess();

    // creat a tank object
    private Tank myTank = new Tank(100, 100, Group.Green, Direction.Up, this);

    public void gamePage(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/GameScene.fxml"));
        stage.getScene().setRoot(root);
        paint();
        stage.getScene().setOnKeyPressed(keyProcess);
    }

    public void clear(Stage stage) {
        stage.getScene().removeEventHandler(KeyEvent.KEY_RELEASED, keyProcess);
    }

    public void paint() {
        myTank.paint(root);
    }

    private class KeyProcess implements EventHandler<KeyEvent> {

        @Override
        public void handle(KeyEvent keyEvent) {
            KeyCode keyCode = keyEvent.getCode();
            //press key
            myTank.pressed(keyCode);
        }
    }
}

