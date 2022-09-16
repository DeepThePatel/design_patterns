package factory;

import java.util.ArrayList;
import java.util.Random;

abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<String>();

    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String prepare() {
        /**
         * Calling prepare methods for the cereals
         */
        System.out.println("Preparing the " + name);
        FrostedFlakes ff = new FrostedFlakes(name, price);
        FruitLoops fl = new FruitLoops(name, price);
        LuckyCharms lc = new LuckyCharms(name, price);
    }

    public String boxCereal() {
        /**
         * Generating a random number to randomly select toy
         */
        Random random = new Random();
        int randomNumber=random.nextInt(toys.size());

        /**
         * Printing the boxCereal strings for the cereals
         */
        System.out.println("Boxing the " + name);
        System.out.println("- Drawing fun pictures of " + name + " on the box");
        System.out.println("- Pouring the " + name + " into the box");
        System.out.println("- Adding the surprise " + toys.get(randomNumber));
    }

    /**
     * Printing the price and name of the cereals
     * @return String printing price and name of cereal associated with each cereal
     */
    public String priceCereal() {
        System.out.println("Putting a price tag of $" + price + " on the " + name + " box");
    }
}
