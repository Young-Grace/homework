package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AsciiChars {
	
  public static void printNumbers()
  {
    // TODO: print valid numeric input System.out.println()
	  
	  for(int i = 48; i <= 57; i++) {
		  String cherry = Character.toString ((char) i);
		  System.out.println(cherry);
	  }
  }

  public static void printLowerCase()
  {
    // TODO: print valid lowercase alphabetic input
	  
	  for(int i = 97; i <= 122; i++) {
		  String lower = Character.toString ((char) i);
		  System.out.println(lower);
	  }
  }

  public static void printUpperCase()
  {
    // TODO: print valid uppercase alphabetic input
	  
	  for(int i = 65; i <= 90; i++) {
		  String upper = Character.toString ((char) i);
		  System.out.println(upper);
	  }
  }
  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		printNumbers();
//		printLowerCase();
//		printUpperCase();
		
		System.out.println("Please enter your name: ");
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		
		
		System.out.println("Would you like to continue? Y/N?");
		
		String answer = sc.nextLine();
		
		if(answer.equalsIgnoreCase("y")) {
			System.out.println("Let's continue.");
		} else {
			System.out.println("Please return later to complete the survey.");
		}
		
		
		System.out.println("What is the name of your favorite pet? ");
		System.out.println(answer);
		
		System.out.println("How old is your favorite pet? ");
		System.out.println(answer);
		
		System.out.println("What is your lucky number? ");
		System.out.println(answer);
		
		System.out.println("Do you have a favorite quarterback? If so, what is their jersey number? ");
		System.out.println(answer);
		
		System.out.println("What is the two-digit model year of your car? ");
		System.out.println(answer);
		
		System.out.println("What is the first name of your favorite actor or actress? ");
		System.out.println(answer);
		
		System.out.println("Enter a number between 1 and 50. ");
		System.out.println(answer);
		
		
//		PROMT USER FOR INPUT
		System.out.println("what is your favorite QB Jersey number or two digit lucky number? ");
//		SUMMONS THE lotto METHOD
		lotto();
//		PROMT USER FOR INPUT. USES printf TO ENSURE QUESTION IS ASKED ON A SEPERATE LINE EVERYTIME
		System.out.printf("%nWould you like to play again? 'Y' or 'N' %n" );
//		SUMMONS USER INPUT USING THE SCANNER CLASS
//		Scanner sc = new Scanner(System.in);
//		STORES THE USER INPUT INTO THE VARIABLE CALLED contNU
		String contNU = sc.nextLine();
//		AN IF ELSE LOOP THAT PROMPTS THE USER TO CONTINUE OR QUIT
		if(contNU.equalsIgnoreCase("Y")) {
//			IF USER HITS 'y' SUMMON THE lotto METHOD AGAIN
			System.out.println("what is your favorite QB Jersey number or two digit lucky number? ");
			lotto();
		} else if(contNU.equalsIgnoreCase("N"))  {
			System.out.println("THANKS FOR PLAYING GOODBYE ");
		}else {
			System.out.println("PLEASE TYPE 'Y' or 'N' ");
		}
	}
//	HERE IS THE LOTTO METHOD
	public static void lotto() {
//		SUMMONS USER INPUT USING THE SCANNER CLASS
		Scanner sc = new Scanner(System.in);
//		SAVE THAT INPUT TO A VARIABLE FOR USE. THAT VARIABLE IN THIS CASE IS CALLED luckyJersey
		int luckyJersey = sc.nextInt();
//		GENERATES A RANDOM NUMBER BETWEEN 1 AND 75. THIS PROCESS IS STORED TO THE VARIABLE CALLED random
		int random = ThreadLocalRandom.current().nextInt(75); 
//		CREATES THE MAGICBALL NUMBER
		int magicBall = random * luckyJersey;
//		CREATES AN ARRAY LIST NAMED arrli TO STORE THE NUMBERS
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
//		Int n CORRELATES TO THE INTENDED MAXIMUM # OF TIMES I WANT TO LOOP 
		int n = 5; 
//		LOOPS n TIMES THROUGH THE ARRAY AND ADDS RANDOM NUMBERS MINUS 10
		for (int i = 1; i <= n; i++) { 
            arrli.add(random - 10); 
//            REASSIGNS THE VARIABLE CALLED random TO A NEW RANDOM NUMBER. REMOVAL OF THIS LINE WILL CAUSE THE SAME NUMBER TO POPULATE REPEATEDLY
            random = ThreadLocalRandom.current().nextInt(75);
		}
//		PRINTS OUT THE ARRAY LIST
		System.out.print("LOTTERY NUMBERS : " + arrli + " "); 
		System.out.print("MAGIC BALL : " + magicBall + " "); 
	}
		

		
		}
		
		
	



//Character.toString ((char) i);