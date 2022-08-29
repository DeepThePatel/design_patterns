public class iRobot extends Robot{
    public iRobot(String name) {
        super(name);
        movebehavior = new CrawlBehavior();
        movebehavior = new WalkBehavior();
        movebehavior = new RunBehavior();
        character.add('i');
    }

    public String toString() {
        character.add(name + "is a robot");
    }
}
