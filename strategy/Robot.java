import java.util.ArrayList;

public class Robot {
    protected String name;
    protected MoveBehavior movebehavior;
    protected ArrayList<String> character = new ArrayList<String>();

    public Robot(String name) {
        this.name = name;
    }

    public void setMoveBehavior(MoveBehavior movebehavior) {
        movebehavior = mb;
    }

    public void move() {
        movebehavior.move();
    }

    public String toString() {
        return name + "" + mb;
    }

    public String getName() {
        return name;
    }
}