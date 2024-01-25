package Week10.DesignPatterns.Builder;

import java.util.List;

public class HouseBuilder {
    private String roof;
    private List<String> walls;
    private String doors;
    private String floors;
    private String windows;

    public HouseBuilder setRoof(String roof) {
        this.roof = roof;
        return this;
    }
    public HouseBuilder setWalls(List<String> walls) {
        this.walls = walls;
        return this;
    }
    public HouseBuilder setDoors(String doors) {
        this.doors = doors;
        return this;
    }
    public HouseBuilder setFloors(String floors) {
        this.floors = floors;
        return this;
    }
    public HouseBuilder setWindows(String windows) {
        this.windows = windows;
        return this;
    }

    public House build() {
        return new House(roof, walls, doors, floors, windows);
    }
}
