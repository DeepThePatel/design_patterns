package factory;

public class GroceryStore {
    public GroceryStore() { }
    
    /**
     * Creating the cereals 
     * @param type Creating cereals
     * @return Cereal text statements
     */
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
        else {
            cereal = new FrostedFlakes("Frosted Flakes",2.99);
        }
        
        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();

        return cereal;
    }
}
    
