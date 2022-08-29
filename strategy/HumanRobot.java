public class HumanRobot extends Robot{
    public HumanRobot(String name) {
        super(name);
        movebehavior = new CrawlBehavior();
        movebehavior = new WalkBehavior();
        movebehavior = new RunBehavior();
        character.add('o');
        character.add('-','|','-');
        character.add('/','\\');
    }

    public String toString() {
        character.add(name + "is a robot");
    }
}
