package practice;

public class MagicCalculator extends calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sqroot(8));
		System.out.println(sin(6));
		System.out.println(cosin(10));
		System.out.println(tangent(6));
		System.out.println(factorial(6));
		
		
	}

	
	public static double sqroot(int num1) {
		
		return Math.sqrt(num1);
	}
	
	
	
	public static double sin(double num1) {
		
		double rads = Math.toRadians(num1);
		return Math.sin(rads);
		
	}
	
	
	public static double cosin(double num1) {
		
		double rads = Math.toRadians(num1);
		return Math.cos(rads);
	}
	
	
	
	public static double tangent(double num1) {
		
		double rads = Math.toRadians(num1);
		return Math.tan(rads);
		
	}
	
	
	public static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));
	}
	
	
	
	
}
