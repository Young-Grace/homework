package practice;

public class calculator {
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(2, 3));
		System.out.println(subtract(7, 3));
		System.out.println(multiply(5, 3));
		System.out.println(divide(10, 2));
		System.out.println(square(5));
		
	}
	
	
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		return sum;
	}
	
	
	public static int subtract(int num1, int num2) {
		
		int minussum = num1 - num2;
		
		return minussum;
	}
	

	public static int multiply(int num1, int num2) {
		
		int multsum = num1 * num2;
		
		return multsum;
	}
	
	
	public static int divide(int num1, int num2) {
		
		int divsum = num1 / num2;
		
		return divsum;
	}
	
	
	public static int square(int num1) {
		
		int squared = num1 * num1;
		
		return squared;
	}
	

}
