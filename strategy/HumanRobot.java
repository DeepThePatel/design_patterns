public class HumanRobot extends Robot
{

    /**
     * Creates a new Human Robot
     * @param description of parameter
     */
    public HumanRobot(String name) 
    {
        super(name);
        character.add("0");
        character.add("-|-");
        character.add("/ \\");
        this.moveBehavior = new WalkBehavior();
    }
    /**
     * Creates a string representation of the robot
     * @return the name and type of robot
     */
    public String toString() 
    {
        character.add(name + "is a robot");
    }
}
