package decorator;

public class Star extends TreeDecorator{
    private Tree tree;


    /**
     * Passing star.txt to TreeDecorator
     * @param tree Getting lines from star.txt passing in the the tree object
     */
    public Star(Tree tree) {
        super(tree.lines);
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
    }
}
