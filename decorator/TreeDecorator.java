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
                /**
                 * If character found in decor is not empty, set character in string to character in decor
                 */
                if(decor.get(i).charAt(j) != ' ') {
                    temp += decor.get(i).charAt(j);
                }
                /**
                 * Set character to character found in the line array if char in decor array is not found
                 */
                else {
                    temp += lines.get(i).charAt(j);
                }
            }
            lines.set(i, temp);
        }  
    }
}
    
