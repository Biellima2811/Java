package course;

import java.util.Scanner;

import entitites.Rectangle;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rtg = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		
		rtg.width = sc.nextDouble();
		rtg.height = sc.nextDouble();
		
		System.out.println("AREA = " + String.format("%.2f", rtg.area()));
		System.out.println("PERIMETER = " + String.format("%.2f", rtg.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rtg.diagonal()));
		
		sc.close();
	}
}