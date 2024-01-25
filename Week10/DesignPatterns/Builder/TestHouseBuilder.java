package Week10.DesignPatterns.Builder;

import java.util.Arrays;

public class TestHouseBuilder {
    public static void main(String[] args) {
        House house = new HouseBuilder().setDoors("1").setFloors("2").setRoof("1").setWalls(Arrays.asList("4")).setWindows("3").build();
        System.out.println(house.getWindows());
    }
}
