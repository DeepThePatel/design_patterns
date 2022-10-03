package singleton;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import singleton.ClothingPart;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    Random rand = new Random();
    private static OutfitCreator outfitCreator;

    /*
     * Getting clothing from file and adding to array
     */
    private OutfitCreator() {
        bottoms = FileReader.getClothing("bottoms.txt",ClothingPart.BOTTOM);
        tops = FileReader.getClothing("tops.txt", ClothingPart.TOP);
        wholes = FileReader.getClothing("wholes.txt",ClothingPart.WHOLE);
    }

    /*
     * Getting instance of clothing
     */
    public static OutfitCreator getInstance() {
        OutfitCreator outfitCreator = OutfitCreator.getInstance();
        return outfitCreator;
    }

    /*
     * Getting outfit from text files
     */
    public String getOutfit(Season season) {
        return getOutfit(season);
    }
}
