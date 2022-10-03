package singleton;

import java.util.ArrayList;

public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    /*
     * Setting clothing part values
     */
    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
    }

    /*
     * Check if season is in the array
     */
    public boolean hasSeason(Season season) {
            if(seasons.contains(season)) {
                return true;
            }
            else {
              return false;
            }
    }

    /*
     * Adding seasons
     */
    public void addSeason(Season season) {
        seasons.add(Season.FALL);
        seasons.add(Season.SPRING);
        seasons.add(Season.SUMMER);
        seasons.add(Season.WINTER);
    }

    /*
     * Output string
     */
    public String toString(){
        return "A " + color + " " + part + " " + name;
    }
}
