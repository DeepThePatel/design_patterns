public class Driver {
    public static void main(String [] args) {
        Robot irobot = new iRobot("Sally");
        Robot humanrobot = new HumanRobot("Fred");
        Robot dogrobot = new DogRobot("Zeus");

        irobot.display();
        irobot.crawlbehavior();
        irobot.walkbehavior();
        irobot.runbehavior();

        dogrobot.display();
        dogrobot.crawlbehavior();
        dogrobot.walkbehavior();
        dogrobot.runbehavior();

        humanrobot.display();
        humanrobot.crawlbehavior();
        humanrobot.walkbehavior();
        humanrobot.runbehavior();
    }
}
