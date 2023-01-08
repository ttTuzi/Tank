package tank;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.stage.Stage;
import tank.scene.GamePage;
import tank.scene.StartingPage_;

import java.io.IOException;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月02日 9:35 PM
 */
public class Director {

    private static Director instance = new Director();
    private GamePage gamePage = new GamePage();
    private Stage stage;
    private Director(){

    }

    public static Director getInstance(){
        return instance;
    }

    public void initialScreen(Stage stage) throws IOException {
        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);

        this.stage =stage;
        StartingPage();
        stage.show();
    }

    public void StartingPage() throws IOException{
        StartingPage_.startingPage(stage);
    }

    public void gameStart()throws Exception{
        gamePage.gamePage(stage);
    }

    public void gameOver() throws Exception {

    }
}
