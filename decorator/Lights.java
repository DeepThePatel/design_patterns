package decorator;

public class Lights extends TreeDecorator{
    private Tree tree;

    /**
     * Passing lights.txt to TreeDecorator
     * @param tree Getting lines from lights.txt passing in the tree object
     */
    public Lights(Tree tree) {
        super(tree.lines);   
        this.tree = tree;
        integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
}
