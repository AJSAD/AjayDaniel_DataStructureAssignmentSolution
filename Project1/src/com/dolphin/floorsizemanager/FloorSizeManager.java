package com.dolphin.floorsizemanager;

import java.util.HashSet;
import java.util.Scanner;

public class FloorSizeManager {
	HashSet<Integer> existingFloors;
	
	FloorSizeManager() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		System.out.println("\nThe order of construction is as follows\n\n" +
							computeFloor(sc.nextInt(), sc));
	}
	
	private String computeFloor(int N,Scanner sc) {
		int max = N;
		String result = "";
		existingFloors = new HashSet<Integer>();
		
		for(int i = 1; i <= N; i++) {
			
			System.out.println("Enter the floor size given on day :" + i);
			int floor = sc.nextInt();
			String completedFloor = "";
			
			result += "Enter the floor size given on day : "+ i +"\n";
			
			if(floor == max) {
				completedFloor += Integer.toString(floor);
				while(existingFloors.contains(--max)) {
					completedFloor = Integer.toString(max) + " " + completedFloor;
				}
			}
			else {
				existingFloors.add(floor);
			}
			
			result += completedFloor + "\n";
		}
		
		return result;
	}
}
