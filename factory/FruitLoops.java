package factory;

public class FruitLoops extends Cereal{
    
    /**
     * Setting the variables and adding toys to the array
     * @param name Name of the cereal
     * @param price Price of the cereal
     */
    public FruitLoops(String name, double price) {
        super(name,price);
        name = "Fruit Loops";
        price = 1.89;
        toys.add("Paw Patrol stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny car");
    }

    /**
     * Prepare text for Fruit Loops
     */
    public String prepare() {
        /*
        System.out.println("- Gather the grain");
        System.out.println("- Shape into circles");
        System.out.println("- Randomly color circles");
        System.out.println("- Let circles dry\n");
        */

        return "- Gather the grain\n- Shape into circles\n- Randomly color circles\n- Let circles dry\n";
    }
}
