package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopMapHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Insert first number 1-10 ");


		for(int i = 0; i < 5; i++) {
			
			
			System.out.println("Insert number 1-10 ");
			int num = sc.nextInt();
			arr.add(num);
		}
		
		System.out.println(arr);
		
		
		int sum = 0;
		int product = 1;
		
		for(int item : arr) {
			sum += item;
			product *= item;
			
		}
		
		int max = Integer.MIN_VALUE; // [-1, -2, -3, -4]
		for (int i = 0; i < arr.size(); i++) { // 0, 1, 2, 3, 4, 5
			if (arr.get(i) > max) {
				max = arr.get(i);
			}
		}
		
		int min = Integer.MAX_VALUE; // [-1, -2, -3, -4]
		for (int i = 0; i < arr.size(); i++) { // 0, 1, 2, 3, 4, 5
			if (arr.get(i) < min) {
				min = arr.get(i);
			}
			
		

		
	}

	
		System.out.println(sum);
		System.out.println(product);
		System.out.println(min);
		System.out.println(max);
	
	
	
	
	}
}
