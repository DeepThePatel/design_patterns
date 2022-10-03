package singleton;

import java.util.ArrayList;

public class ClothingItem {
    private String name;
    private ClothingPart part;
    private String color;
    private ArrayList<Season> seasons;

    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
    }

    //WORK ON
    public boolean hasSeason(Season season) {
            if(seasons.contains(season)) {
                return true;
            }
            else {
              return false;
            }
    }

    public void addSeason(Season season) {
        seasons.add(Season.FALL);
        seasons.add(Season.SPRING);
        seasons.add(Season.SUMMER);
        seasons.add(Season.WINTER);
    }

    public String toString(){
        return "A " + color + " " + part + " " + name;
    }
}
