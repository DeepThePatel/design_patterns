package factory;

public class FrostedFlakes extends Cereal{

    /**
     * Setting variables and adding toys to the array
     * @param name Name of the cereal
     * @param price Price of the cereal
     */
    public FrostedFlakes(String name, double price) {
        super(name, price);
        name = "Frosted Flakes";
        price = 2.99;
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo");
        toys.add("Snap bracelet");
        toys.add("Happy Feet figurine");
    }

    /**
     * Prepare text for Frosted Flakes
     */
    public String prepare() {
        /*
        System.out.println("- Gather the grain");
        System.out.println("- Shape into flakes");
        System.out.println("- Sprinkle with frosting\n");
        */

        return "- Gather the grain\n- Shape into flakes\n- Sprinkle with frosting\n";
    }
}
