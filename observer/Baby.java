import java.util.ArrayList;
import java.util.Random;

/**
 * Creating a new instance of a baby
 */
public class Baby {
    protected String name;
    protected ArrayList observers = new ArrayList<>();
    Random rand = new Random();

    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveLove() {

    }

    public void eat() {

    }

    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    public void registerObserver(Observer observer) {
        
    }

    public void removeObserver(Observer observer) {
        
    }

    public void notifyObservers(Cry cry) {
        
    }

    public void angryCry() {
        System.out.println("Waaaaaaaaaaaa!" + name + " is feeling abandoned and angry.");
        notifyObservers(cry);
    }

    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!!!");
        notifyObservers(cry);
    }

    public void wetCry() {
        System.out.println("Aaaaaaaaaaa! " + name + " is WET!");
        notifyObservers(cry);
    }

}
