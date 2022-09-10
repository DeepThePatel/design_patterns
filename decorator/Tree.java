package decorator;

import java.util.ArrayList;

abstract class Tree {
    protected ArrayList<String> lines = new ArrayList<String>();

    public Tree(ArrayList<String> lines) {
        for(int i=0;i<lines.size();i++) {
           this.lines = lines;
        }        
    }

    public String toString() {
        String result = "";
        for(int i=0;i<lines.size();i++) {
           result += lines.get(i) + "\n";
        }
        return result;
    }       
}
