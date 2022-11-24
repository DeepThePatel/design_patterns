package adapter;
import java.util.ArrayList;

public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassett(ArrayList<String> songs) {
        this.songs = songs;
    }

    public String play() {
        for(int currentIndex=0;currentIndex<songs.size(); currentIndex++) {
            System.out.println("Playing song " + currentIndex + ": " + songs.get(currentIndex));
            if(currentIndex==songs.size()) {
                System.out.println("At thte end of the Cassette you need to rewind");
            }
        }
    }

    public String rewind() {
        if(currentIndex==0) {
            System.out.println("Fully re-wound");
        }
        else {
            currentIndex--;
            System.out.println("Rewinding to song " + currentIndex);
        }
    }
    
    public String ffwd() {
        for(currentIndex=0;currentIndex<songs.size();currentIndex++) {
        }
        if(currentIndex>songs.size()) {
            System.out.println("At the end of the cassette you need to rewind");
        }   
            System.out.println("Forward to song " + currentIndex);
            currentIndex++;
            if(currentIndex==songs.size()) {
                System.out.println("Forwarded to the end of the cassette");
            }
        }
    }

    public String pause() {
        return "Pausing...";
    }

    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
}
