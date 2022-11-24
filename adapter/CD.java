package adapter;
import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    public String playFromBeginning() {
        return "Playing song 1 " + songs.get(0);
    }

    public String playSong(int num) {
        if(num>=0 || num<=songs.size()) {
            return "Playing " + songs.get(num);
        }
        else {
            return "Not a valid song number";
        }
    }

    public String prevSong() {
        if(currentIndex==0) {
            return "Already at beginning";
        }
        else {
            currentIndex--;
            return "Skipping back and playing: " + songs.get(currentIndex);
        }
    }

    public String nextSong() {
        if(currentIndex==songs.size()) {
            return playFromBeginning();
        }
        String nextSong = "Playing " + currentIndex + ": " + songs.get(currentIndex);
        currentIndex++;
        return nextSong;
    }

    public String stop() {
        return "Stopping";
    }

    public String pause() {
        return "Pausing";
    }
}
