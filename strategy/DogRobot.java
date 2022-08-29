public class DogRobot extends Robot{
    
    public DogRobot(String name) {
        super(name);
        movebehavior = new CrawlBehavior();
        movebehavior = new WalkBehavior();
        movebehavior = new RunBehavior();
        character.add('+','+','o');
    }

    public String toString() {
        character.add(name + "is a robot");
    }
}
