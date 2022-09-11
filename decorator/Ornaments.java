package decorator;

public class Ornaments extends TreeDecorator{
    private Tree tree;

    /**
     * Passing ornaments.txt to TreeDecorator
     * @param tree Reading lines from ornaments.txt passing in the tree object
     */
    public Ornaments(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }
}
