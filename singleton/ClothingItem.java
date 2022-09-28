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

    public boolean hasSeason(Season season) {

    }

    public void addSeason(Season season) {

    }

    public String toString(){
        return "A " + color + " " + part + " " + name;
    }
}
