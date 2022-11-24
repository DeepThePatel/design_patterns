package adapter;
import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassett(ArrayList<String> songs) {
        this.songs = songs;
    }

    public String play() {
        for(currentIndex=0; currentIndex<songs.size(); currentIndex++) {
            if(currentIndex==songs.size()-1) {
                return "At the end of the Cassette you need to rewind";
            }
            return "Playing song " + currentIndex + ": " + songs.get(currentIndex);
        }
        //return play();
    }

    public String rewind() {
        if(currentIndex==0) {
            return "Fully re-wound";
        }
        else {
            currentIndex--;
            return "Rewinding to song " + currentIndex;
        }
    }
    
    public String ffwd() {
        for(currentIndex=0;currentIndex<songs.size();currentIndex++) {
            if(currentIndex==songs.size()) {
                return "At the end of the cassette you need to rewind";
            }
            currentIndex++;               
            if(currentIndex==songs.size()) {
                return "Forwarded to the end of the cassette";
            }
            return "Forward to song " + currentIndex;
        }
        //return ffwd();
    }

    public String pause() {
        return "Pausing...";
    }

    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
}
