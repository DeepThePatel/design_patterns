import java.util.ArrayList;

public class Robot {
    protected String name;
    protected MoveBehavior moveBehavior;
    protected ArrayList<String> character = new ArrayList<String>();

    public Robot(String name) {
        this.name = name;
        character = new ArrayList<>();
    }

    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public void move() {
        moveBehavior.move();
    }

    public String toString() {
        return name + "" + moveBehavior;
    }

    public String getName() {
        return name;
    }
}
