package decorator;

import java.util.ArrayList;

abstract class TreeDecorator extends Tree{

    /*
     * Getting the lines ArrayList (the tree), then joining the tree with the decor
     */
    public TreeDecorator(ArrayList<String> lines) {
        super(lines);
        integrateDecor(lines);
        
    }

    /**
     * Replacing the empty spaces in the lines array list with the decor
     * @param decor Passing in the type of decor to conjoin with the tree
     */
    protected void integrateDecor(ArrayList<String> decor) {
            for(int i=0;i<decor.size();i++) {
                for(int j=0;decor.get(j).charAt(j)<decor.size();j++)
                if(decor.get(i).charAt(i) != ' ') {
                    this.lines = decor;
                }
            }  
    }
}
    
