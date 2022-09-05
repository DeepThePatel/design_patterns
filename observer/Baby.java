import java.util.ArrayList;
import java.util.Random;

/**
 * Creating a new instance of a baby
 */
public class Baby {
    protected String name;
    public ArrayList observers = new ArrayList<>();
    Random rand = new Random();

    public Baby(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
/**
 * Creating the receiveLove method where either of two strings are randomly selected
 */
    public void receiveLove() {
        String [] rl = {name + " feels appreciated and loved.", name + " pushes everyone away and continues to cry."};
        int select = rand.nextInt(rl.length);
        System.out.println(rl[select]);
    }
/**
 * Creating the eat method where either of two strings are randomly selected
 */
    public void eat() {
        String [] eat = {name + " has a happy full tummy.", name + " throws all his food on the floor."};
        int select = rand.nextInt(eat.length);
        System.out.println(eat[select]);
    }

    public void getChanged() {
        System.out.println(name + " is having a diaper change.");
    }

    public void registerObserver(Observer observer) {
        observers.get(0);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Cry cry) {
        observers.notify();
    }
/**
 * Methods that display the baby's current emotion and uses the notify observer method to act accordingly based on type of emotion
 */
    public void angryCry() {
        System.out.println("Waaaaaaaaaaaa!" + name + " is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    public void hungryCry() {
        System.out.println("Neh Neh Neh! " + name + " is starving!!!!!");
        notifyObservers(Cry.HUNGRY);
    }

    public void wetCry() {
        System.out.println("Aaaaaaaaaaa! " + name + " is WET!");
        notifyObservers(Cry.WET);
    }

}
