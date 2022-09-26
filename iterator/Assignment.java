package iterator;

public class Assignment {
    private String title;
    private String description;
    private Topic topic;

    /*
     * Sets title, description, and topic of assignment
     */
    public Assignment(String title, String description, Topic topic) {
        this.title = title;
        this.description = description;
        this.topic = topic;
    }

    /*
     * Checks if topic is valid
     */
    public boolean hasTopic(Topic topic) {
        if(topic != "ALL" || "PROJECT" || "DESIGN_PATTERN" || "GIT") {
            return false;
        }
        return true;
    }

    /*
     * Prints assignment
     */
    public String toString() {
        return title + " " + description + " " + topic;
    }
}
