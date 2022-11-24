package adapter;

public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    public String play() {
        album.playSong(0);
    }

    public String rewind() {
        album.prevSong();
    }
    
    public String ffwd() {
        album.nextSong();
    }

    public String pause() {
        album.pause();
    }

    public String stopEject() {
        album.stop();
    }
}
