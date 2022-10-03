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

    private OutfitCreator() {
        FileReader.getClothing();
    }

    public static OutfitCreator getInstance() {
        OutfitCreator outfitCreator = OutfitCreator.getInstance();
        return outfitCreator;
    }

    public String getOutfit(Season season) {
        bottoms = FileReader.getClothing("bottoms.txt",ClothingPart.BOTTOM);
        tops = FileReader.getClothing("tops.txt", ClothingPart.TOP);
        wholes = FileReader.getClothing("wholes.txt",ClothingPart.WHOLE);
    }
}
