import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    Random rand = new Random();
    private static OutfitCreator outfitCreator;

    private OutfitCreator() {
    
    }

    public static OutfitCreator getInstance() {
        OutfitCreator outfitCreator = OutfitCreator.getInstance();
        return outfitCreator;
    }

    public String getOutfit(Season season) {

    }
}
