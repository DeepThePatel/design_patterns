package factory;

public class GroceryStore {
    public GroceryStore() { }
        
    public Cereal createCereal(String type) {
        Cereal cereal;

        if(type.equals("frosted flakes")) {
            cereal = new FrostedFlakes("Frosted Flakes",2.99);
        }
        else if(type.equals("fruit loops")) {
            cereal = new FrostedFlakes("Fruit Loops",1.89);
        }
        else if(type.equals("lucky charms")) {
            cereal = new FrostedFlakes("Lucky Charms",1.55);
        }

        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();
    }
}
    
