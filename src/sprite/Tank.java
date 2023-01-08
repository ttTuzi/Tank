package sprite;

import javafx.fxml.FXMLLoader;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import tank.scene.GamePage;
import util_.Direction;
import util_.Group;

import java.io.IOException;
import java.util.Vector;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月05日 10:11 PM
 */
public class Tank extends Role {
    //to check if the key is pressed or not
    //boolean keyUp,keyDown,keyLeft,keyRight;

    int Speed = 5;

    public Tank(double x, double y, Group group, Direction direction, GamePage gamePage) {
        super(0, 0, group, direction, gamePage);
        this.width = 35;
        this.height = 35;
        try {
            if(group.equals(Group.Green)){
                image= FXMLLoader.load(getClass().getResource("/greentank.fxml"));
            }else {
                image=FXMLLoader.load(getClass().getResource("/redtank.fxml"));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    //check key press
    public void pressed(KeyCode keyCode){
        switch(keyCode){
            case W:
                direction = Direction.Up;
                move();
                break;
            case S:
                direction = Direction.Down;
                move();
                break;
            case A:
                direction = Direction.Left;
                move();
                break;
            case D:
                direction = Direction.Right;
                move();
        }

    }

    @Override
    public void move() {
        switch (direction){
            case Up:
                image.setRotate(0);
                image.setY(y-=Speed);
                break;
            case Down:
                image.setRotate(180);
                image.setY(y+=Speed);
                break;
            case Left:
                image.setRotate(270);
                image.setX(x-=Speed);
                break;
            case Right:
                image.setRotate(90);
                image.setX(x+=Speed);
        }
        System.out.println("x: "+x+"  y: "+y);
        if(this.x<=0){
            x=0;
        }
        if(this.x>=1165){
            x=1165;
        }
        if(this.y<=0){
            y=0;
        }
        if(this.y>=750){
            y=750;
        }

    }

    @Override
    public void paint(AnchorPane root) {
        image.setY(x);
        image.setY(y);
        root.getChildren().add(image);
    }

    @Override
    public boolean collisionDetection(Sprite sprite) {
        return false;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }
}
