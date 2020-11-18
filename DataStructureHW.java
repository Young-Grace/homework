package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class DataStructureHW {

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
		
		for(int item : arr) {
			sum += item;
		

		}
		
		System.out.println(sum);
		
		
		// Output is 2 which is the index of the maximum which is 6
//		double[ ] exampleArray = {1,5,6,5,4,1};
//
//        double maximum = exampleArray[0];
//
//        int index = 0;
//
//        for (int i = 1; i < exampleArray.length; i++){
//
//             if (exampleArray[ i ] > maximum) {
//
//                  maximum = exampleArray[ i ];
//
//                  index = i;
//
//             }
//
//        }
//
//        System.out.println(index);

	}

	
	
//	public static int[] toPower(int size, int power) {
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>(size);
//		
//		Scanner sc = new Scanner(System.in);
//		int[] array = new int[size];
//		
//		size = 4;
//		power = 2;
//		
//		for (int i = 0; i < size; i++){
//		i *= power;
//
//		
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
}
