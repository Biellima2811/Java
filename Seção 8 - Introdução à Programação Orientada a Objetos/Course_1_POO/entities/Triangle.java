<<<<<<< HEAD
// O 'package entities' serve para organizar suas classes. 
// É como uma pasta para guardar suas "formas de bolo".
package entities;

// A declaração 'public class Triangle' cria o molde, a planta para qualquer objeto Triângulo.
// Tudo que estiver aqui dentro define como um triângulo será e o que ele poderá fazer.
public class Triangle {
	
	// --- ATRIBUTOS ---
	// Estes são os atributos (características) de um triângulo.
	// Todo objeto 'Triangle' que for criado terá essas três variáveis.
	// Elas são 'public' para que o programa principal possa acessá-las diretamente.
	public double a;
	public double b;
	public double c;
	
	// --- MÉTODOS ---
	// Este é um método (uma ação/comportamento) que o triângulo pode executar.
	// Ele não precisa de nenhuma informação extra (não tem parâmetros nos parênteses),
	// pois usará os próprios atributos (a, b, c) para o cálculo.
	// Ele retorna um valor 'double', que será a área calculada.
	public double area() {
		// A lógica para calcular a área está aqui dentro, usando a Fórmula de Heron.
		// 'p' é a variável para o semiperímetro.
		double p = (a + b + c) / 2.0;
		
		// Math.sqrt() é a função da biblioteca Java para calcular a raiz quadrada.
		// A instrução 'return' envia o resultado final de volta para quem chamou o método.
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
=======
// O 'package entities' serve para organizar suas classes. 
// É como uma pasta para guardar suas "formas de bolo".
package entities;

// A declaração 'public class Triangle' cria o molde, a planta para qualquer objeto Triângulo.
// Tudo que estiver aqui dentro define como um triângulo será e o que ele poderá fazer.
public class Triangle {
	
	// --- ATRIBUTOS ---
	// Estes são os atributos (características) de um triângulo.
	// Todo objeto 'Triangle' que for criado terá essas três variáveis.
	// Elas são 'public' para que o programa principal possa acessá-las diretamente.
	public double a;
	public double b;
	public double c;
	
	// --- MÉTODOS ---
	// Este é um método (uma ação/comportamento) que o triângulo pode executar.
	// Ele não precisa de nenhuma informação extra (não tem parâmetros nos parênteses),
	// pois usará os próprios atributos (a, b, c) para o cálculo.
	// Ele retorna um valor 'double', que será a área calculada.
	public double area() {
		// A lógica para calcular a área está aqui dentro, usando a Fórmula de Heron.
		// 'p' é a variável para o semiperímetro.
		double p = (a + b + c) / 2.0;
		
		// Math.sqrt() é a função da biblioteca Java para calcular a raiz quadrada.
		// A instrução 'return' envia o resultado final de volta para quem chamou o método.
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}