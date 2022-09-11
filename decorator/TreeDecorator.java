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
            String temp = "";
            for(int j=0;j<decor.get(i).length();j++) {
                if(decor.get(j).charAt(j) != ' ') {
                    temp += decor.get(i).charAt(j);
                }
            }
            lines.set(i, temp);
        }  
    }
}
    
