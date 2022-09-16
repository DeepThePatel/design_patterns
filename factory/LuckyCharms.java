package factory;

public class LuckyCharms extends Cereal{
    
    /**
     * Setting the variables and adding toys to the array
     * @param name Name of the cereal
     * @param price Price of the cereal
     */
    public LuckyCharms(String name, double price) {
        super(name, price);
        this.name = "Lucky Charms";
        this.price = 1.55;
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring");
        toys.add("Play doe");
        toys.add("Tiny truck");
    }

    /**
     * Prepare text for Lucky Charms
     */
    public String prepare() {
        System.out.println("- Gather the grain");
        System.out.println("- Shape into Xs and Os");
        System.out.println("- Create marshmallow shapes");
        System.out.println("- Mix grain and marshmallows\n");
    }
}
