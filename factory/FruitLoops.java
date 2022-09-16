package factory;

public class FruitLoops extends Cereal{
    
    public FruitLoops(String name, double price) {
        super(name,price);
        name = "Fruit Loops";
        price = 1.89;
        toys.add("Paw Patrol stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny car");
    }

    public String prepare() {
        System.out.println("- Gather the grain");
        System.out.println("- Shape into circles");
        System.out.println("- Randomly color circles");
        System.out.println("- Let circles dry\n");
    }
}
