package Week07.Comparables;

import java.util.PriorityQueue;

public class SongRequest implements Comparable<SongRequest> {
    private Song song;
    private double bid;

    public SongRequest(Song song) {
        this.song = song;
    }

    public SongRequest(Song song, double bid) {
        this.song = song;
        this.bid = bid;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "[" + song + ", " + bid + "]";
    }

    @Override
    public int compareTo(SongRequest o) {
        if (this.getBid() == o.getBid()) {
            return 0;
        } else if (this.getBid() > o.getBid()) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<SongRequest> songRequests = new PriorityQueue<>();
        SongRequest r1 = new SongRequest(new Song("Take on me", "A-Ha"), 11);
        SongRequest r2 = new SongRequest(new Song("Africa", "Toto"), 15);
        SongRequest r3 = new SongRequest(new Song("Little Lion Man", "Mumford and Sons"), 13);
        songRequests.add(r1);
        songRequests.add(r2);
        songRequests.add(r3);
        while (!songRequests.isEmpty())
            System.out.println(songRequests.poll());
        // System.out.println(songRequests);
    }
}
