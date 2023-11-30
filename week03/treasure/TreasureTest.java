package com.skillstorm.classes;

public class TreasureTest {

	public static void main(String[] args) {
		Treasure treasure1 = new Treasure();
		Treasure treasure2 = new Treasure("ruby", "radiant", 1500.95);
		Treasure treasure3 = new Treasure("hat", "suave", 35.99);
		TreasureChest treasureChest = new TreasureChest(25.0, 24, 16, 18, true,
				new Treasure[]{treasure1, treasure2, treasure3});
		
		Treasure[] contents = treasureChest.getContents();
		
		System.out.println(treasureChest);
		System.out.println(contents + "\n");
		treasureChest.setLocked(false);
		System.out.println(treasureChest);
		contents = treasureChest.getContents();
		for (Treasure treasure : contents) {			
			System.out.println(treasure.toString());
		}
		
	}

}
