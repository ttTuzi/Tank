package tank;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月02日 9:25 PM
 */
public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        Director.getInstance().initialScreen(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
