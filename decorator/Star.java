package decorator;

public class Star extends TreeDecorator{
    private Tree tree;

    Star(Tree tree) {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }
}
