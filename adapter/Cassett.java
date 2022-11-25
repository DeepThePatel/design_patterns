package adapter;
import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassett(ArrayList<String> songs) {
        this.songs = songs;
        currentIndex = 0;
    }

    public String play() {
            if(currentIndex==songs.size()) {
                return "At the end of the Cassette you need to rewind";
            }
            System.out.print("Playing song " + (currentIndex+1) + ": " + songs.get(currentIndex));
            currentIndex++;
            return "";
    }

    public String rewind() {
        if(currentIndex==0) {
            return "Fully re-wound";
        }
        else {
            currentIndex--;
            return "Rewinding to song " + (currentIndex+1);
        }
    }
    
    public String ffwd() {
            if(currentIndex==songs.size()) {
                return "At the end of the cassette you need to rewind";
            }           
            else if(currentIndex==songs.size()-1) {
                return "Forward to song " + currentIndex + "\nForwarded to the end of the cassette";
            }
            else {
                currentIndex++;
                return "Forward to song " + (currentIndex+1);
            }
    }

    public String pause() {
        return "Pausing...";
    }

    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
}
