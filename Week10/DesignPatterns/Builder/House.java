package Week10.DesignPatterns.Builder;
import java.util.List;

public class House {
    private String roof;
    private List<String> walls;
    private String doors;
    private String floors;
    private String windows;

    public House(String roof, List<String> walls, String doors, String floors, String windows) {
        this.roof = roof;
        this.walls = walls;
        this.doors = doors;
        this.floors = floors;
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public List<String> getWalls() {
        return walls;
    }

    public String getDoors() {
        return doors;
    }

    public String getFloors() {
        return floors;
    }

    public String getWindows() {
        return windows;
    }
}
