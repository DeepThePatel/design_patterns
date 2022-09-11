package decorator;

public class ChristmasTree extends Tree{
    /**
     * Reading tree.txt
     */
    public ChristmasTree() {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }
}
