package adapter;
import java.util.ArrayList;

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs) {
        this.songs = songs;
    }

    public String playFromBeginning() {

    }

    public String playSong(int num) {

    }

    public String prevSong() {

    }

    public String nextSong() {

    }

    public String nextSong() {

    }

    public String stop() {
        return "Stopping";
    }

    public String pause() {
        return "Pausing";
    }
}
