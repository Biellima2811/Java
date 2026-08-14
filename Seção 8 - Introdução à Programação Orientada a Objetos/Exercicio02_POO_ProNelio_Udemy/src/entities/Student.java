package entities;

public class Student {
	public String name;
	public double grade1, grade2, grade3;
	
	public double calcularNotaFinal() {
		double notaFinal = grade1 + grade2 + grade3;
		return notaFinal;
	}
	
	public void relatorio() {
		double finalGrade = calcularNotaFinal();
		System.out.printf("FINAL GRADE: %.2f", finalGrade);
		if (finalGrade >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			double difference = 60 - finalGrade;
			System.out.printf("MISSING %.2f POINTS\n", difference);
		}
	}
}
