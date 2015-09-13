package quiz1.question1;

import java.util.Scanner;

public class football {
	public static void main(String[] args){
		
		System.out.print("How many completions did the quarterback have? ");
		Scanner scanner1 = new Scanner(System.in);
		int completions = scanner1.nextInt();
		
		System.out.print("How many attempts did the quarterback have? ");
		Scanner scanner2 = new Scanner(System.in);
		int attempts = scanner2.nextInt();
		
		System.out.print("How many touchdowns did the quarterback have? ");
		Scanner scanner3 = new Scanner(System.in);
		int touchdowns = scanner3.nextInt();
		
		System.out.print("How many yards did the quarterback have? ");
		Scanner scanner4 = new Scanner(System.in);
		int yards = scanner4.nextInt();
		
		System.out.print("How many interceptions did the quarterback have? ");
		Scanner scanner5 = new Scanner(System.in);
		int interceptions = scanner5.nextInt();
		
		double a = (((completions/attempts)-.3)*5);
		double b = (((yards/attempts)-3)*25);
		double c = ((touchdowns/attempts)*20);
		double d = (2.375-(interceptions/attempts)*25);
		
		double rating = ((a+b+c+d)/6);
		
		System.out.println("Passer Rating: " + rating);
	}
}