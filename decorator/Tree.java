package decorator;

import java.util.ArrayList;

abstract class Tree {

    /**
     * Creating a new arraylist for the tree
     */
    protected ArrayList<String> lines = new ArrayList<String>();

    /**
     * Getting the lines from tree.txt
     * @param lines Passing in lines gathered from tree.txt to the lines ArrayList
     */
    public Tree(ArrayList<String> lines) {
        for(int i=0;i<lines.size();i++) {
           this.lines = lines;
        }        
    }

    /**
     * Printing the tree
     */
    public String toString() {
        String result = "";
        for(int i=0;i<lines.size();i++) {
           result += lines.get(i) + "\n";
        }
        return result;
    }       
}
