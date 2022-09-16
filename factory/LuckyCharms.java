package factory;

public class LuckyCharms extends Cereal{
    
    public LuckyCharms(String name, double price) {
        super(name, price);
        this.name = "Lucky Charms";
        this.price = 1.55;
    }

    public String prepare() {
        System.out.println("- Gather the grain");
        System.out.println("- Shape into Xs and Os");
        System.out.println("- Create marshmallow shapes");
        System.out.println("- Mix grain and marshmallows\n");
    }
}
