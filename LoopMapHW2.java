package practice;

import java.util.HashMap;
import java.util.Scanner;

public class LoopMapHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> hashmap = new HashMap<>();
		
		hashmap.put("corolla", "toyota");
		hashmap.put("fit", "honda");
		hashmap.put("pt cruiser", "chrysler");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What model are you looking for? ");
		
		System.out.println(hashmap);
		
		String answer = sc.nextLine();
		

		
		if(hashmap.containsKey(answer)) {
			System.out.println("Oh, you're looking for a " + answer + "? " + "Our " + hashmap.get(answer) + " collection is right over here...");
			
		}
		
		
	}

}
