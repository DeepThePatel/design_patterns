package iterator;

import java.util.Iterator;

public class AssignmentIterator{
    private Assignment[] assignments;
    private int position = 0;

    /*
     * Sets assignments array
     */
    public AssignmentIterator(Assignment[] assignments) {
        this.assignments = assignments;
    }

    /**
     * Checks if position is at the end of the array
     * @return False if position goes out of bounds
     */
    public boolean hasNext() {
        if(position >= assignments.length || assignments[position] == null) {
            return false;
        }
        else {
            return true;
        }
    }

    /**
     * Goes to the next position
     * @return Returns next position
     */
    public Assignment next() {
        Assignment assignment = assignments[position];
        position = position + 1;
        return assignment;
    }
}
