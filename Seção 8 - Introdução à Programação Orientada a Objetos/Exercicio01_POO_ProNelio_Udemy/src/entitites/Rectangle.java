package entitites;

public class Rectangle {
	// Letra maiúscula no nome da classe é o padrão Java!
	public double width;
	public double height;
	
	public double area() {
		// O objeto usa os próprios atributos para calcular!
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		// Correção: multiplicando a variável por ela mesma para elevar ao quadrado
		return Math.sqrt((width * width) + (height * height));
	}
}