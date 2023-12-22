package Week06;
import java.util.LinkedList;
import java.util.ListIterator;

public class PlaylistManager {
    private LinkedList<String> playlist;
    private ListIterator<String> playlistIterator;

    public PlaylistManager() {
        playlist = new LinkedList<String>();
        resetPlaylist();
    }

    public void addSong(String song) {
        playlist.add(song);
        resetPlaylist();
        System.out.println(song + " has been added to the playlist.");
    }

    public void play() {
        if (!playlist.isEmpty()) {
            System.out.println("Playing " + playlistIterator.next() + "\n");
            resetPlaylist();
        }
    }

    public void displayPlaylist() {
        if (!playlist.isEmpty()) {
            System.out.println("\nThe playlist has the following songs:");
            ListIterator<String> displayIterator = playlist.listIterator();
            while (displayIterator.hasNext()) {
                System.out.println(displayIterator.next());
            }
            System.out.println();
        }
    }
    
    public void skipSong() {
        if (!playlist.isEmpty()) {
            if (playlistIterator.hasNext()) {
                System.out.println("Skipping to the next song");
                playlistIterator.next();
            }
        }
    }

    private void resetPlaylist() {
        playlistIterator = playlist.listIterator();
    }

    public static void main(String[] args) {
        PlaylistManager plm = new PlaylistManager();
        plm.displayPlaylist();
        plm.addSong("Sweet Home Alabama");
        plm.play();
        plm.addSong("Ring of Fire");
        plm.addSong("Danger Zone");
        plm.displayPlaylist();
        plm.skipSong();
        plm.play();
    }
}
