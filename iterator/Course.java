package iterator;

import org.w3c.dom.NameList;

public class Course {
    private Assignment[] assignments;
    private int count;
    private String name;
    private String title;

    /*
     * Sets course name and title
     */
    public Course(String name, String title) {
        this.name = name;
        this.title = title;
    }

    /*
     * Adds assignment
     */
    public void addAssignment(String title, String description, Topic topic) {
            this.title = title;
            this.description = description;
            this.topic = topic;
    }

    /*
     * Creates iterator
     */
    public AssignmentIterator createIterator() {
       return assignments.iterator();
    }

    /*
     * Returns assignment title + name
     */
    public String toString() {
        return title + " " + name;
    }

    /*
     * Grows array by 2x
     */
    private Assignment[] growArray(Assignment[] first) {
        if(assignments.length = 5) {
            int newArray[] = new int[assignments.length*2];
            System.arraycopy(assignments, 0, newArray, 0, assignments.length);
            return newArray;
        }
        assignments = growArray(assignments);
    }
}
