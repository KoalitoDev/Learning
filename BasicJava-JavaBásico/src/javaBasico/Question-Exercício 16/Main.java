package javaBasico;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double gradeA, gradeB, finalGrade;
		
		gradeA = sc.nextDouble();
		gradeB = sc.nextDouble();
		finalGrade = gradeA + gradeB;
		
		System.out.printf("FINAL GRADE = %.1f%n", finalGrade);
		
		if (finalGrade < 60.0) {
			
			System.out.println("REPROVED");
			
		} 

		sc.close();

	}

}
