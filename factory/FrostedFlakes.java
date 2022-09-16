package factory;

public class FrostedFlakes extends Cereal{

    public FrostedFlakes(String name, double price) {
        super(name, price);
        name = "Frosted Flakes";
        price = 2.99;
    }
    
    public String prepare() {
        System.out.println("- Gather the grain");
        System.out.println("- Shape into flakes");
        System.out.println("- Sprinkle with frosting\n");
    }
}
