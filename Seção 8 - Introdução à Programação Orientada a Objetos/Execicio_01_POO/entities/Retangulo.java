<<<<<<< HEAD
package entities;

public class Retangulo {
	public double altura, largura;
	
	public double area() {
		return largura *  altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal () {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	
	public String toString() {
		return "Área: "
				+ area()
				+ "\nPerimetro: "
				+ perimetro()
				+ "\nDiagonal: "
				+ String.format("%.2f",diagonal());
	}
}
=======
package entities;

public class Retangulo {
	public double altura, largura;
	
	public double area() {
		return largura *  altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal () {
		return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
	}
	
	
	public String toString() {
		return "Área: "
				+ area()
				+ "\nPerimetro: "
				+ perimetro()
				+ "\nDiagonal: "
				+ String.format("%.2f",diagonal());
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
