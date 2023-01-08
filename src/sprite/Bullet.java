package sprite;

import tank.scene.GamePage;
import util_.Direction;
import util_.Group;

/**
 * @Description: TODO
 * @author: Wei Liang
 * @date: 2023年01月07日 5:23 PM
 */
public class Bullet extends Role{

    public Bullet(double x, double y, Group group, Direction direction, GamePage gamePage) {
        super(x, y, group, direction, gamePage);
    }

    @Override
    public void move() {

    }

    @Override
    public boolean collisionDetection(Sprite sprite) {
        return false;
    }
}
