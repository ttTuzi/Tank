package sprite;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import tank.scene.GamePage;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月03日 10:39 PM
 */
public abstract class Sprite {
    ImageView image;
    double x;
    double y;
    double width,height;
    GamePage gamePage;

    public Sprite(ImageView image, double x, double y, GamePage gamePage) {
        this.image = image;
        this.x = x;
        this.y = y;
        this.gamePage = gamePage;
    }

    //for those sprite do not need to remove, such as woods, rocks
    public Sprite(ImageView image, double x, double y, double width, double height) {
        this.image = image;
        this.x = x;
        this.y = y;
    }


    public void paint(AnchorPane root){
        root.getChildren().add(image);
    }

    //return image's contour, to detect if 2 image is overlapping
    public Rectangle2D getContour(){
        return new Rectangle2D(x,y,width,height);
    }

    public void destroy(){

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
