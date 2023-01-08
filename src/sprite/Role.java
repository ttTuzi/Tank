package sprite;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import tank.scene.GamePage;
import util_.Direction;
import util_.Group;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月05日 10:05 PM
 */
public abstract class Role extends Sprite{
    boolean alive = true;
    Group group;
    Direction direction;
    int Speed;
    public Role( double x, double y,Group group, Direction direction, GamePage gamePage) {
        super(null, x, y, gamePage);
        this.group=group;
        this.direction = direction;
    }

    public abstract void move();

    public abstract boolean collisionDetection(Sprite sprite);

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }
}
