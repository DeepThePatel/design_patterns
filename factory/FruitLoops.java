package factory;

public class FruitLoops extends Cereal{
    
    public FruitLoops(String name, double price) {
        super(name,price);
        name = "Fruit Loops";
        price = 1.89;
    }

    public String prepare() {
        System.out.println("- Gather the grain");
        System.out.println("- Shape into circles");
        System.out.println("- Randomly color circles");
        System.out.println("- Let circles dry\n");
    }
}
