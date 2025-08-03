// O 'package aplication' organiza a classe que executa o programa.
package aplication;

// 'import' traz ferramentas de outras bibliotecas para dentro do nosso programa.
import java.util.Locale;    // Para configurar o formato de números (usar ponto em vez de vírgula).
import java.util.Scanner;   // Para ler dados digitados pelo usuário no console.

// 'import entities.Triangle' permite que este arquivo "enxergue" a classe Triangle
// que está em outro pacote. É como dizer: "Eu vou usar a forma de bolo que está na outra pasta".
import entities.Triangle;

// Esta é a classe principal, onde o programa começa a ser executado.
public class Program {

	// O 'main' é o ponto de entrada de qualquer programa Java. A execução começa aqui.
	public static void main(String[] args) {
		
		// Configura o programa para usar o ponto (.) como separador decimal.
		Locale.setDefault(Locale.US);
		// Cria um objeto Scanner para ler a entrada do teclado.
		Scanner sc = new Scanner(System.in);
		
		// Declara duas variáveis, 'x' e 'y', que serão do tipo Triangle.
		// Neste momento, elas são como "caixas vazias" que podem guardar um triângulo.
		Triangle x, y;
		
		// --- INSTANCIAÇÃO DOS OBJETOS ---
		// A palavra 'new' é usada para criar (instanciar) um novo objeto a partir de uma classe.
		// Agora, 'x' e 'y' são dois objetos Triângulo de verdade, independentes um do outro.
		x = new Triangle();
		y = new Triangle();
		
		// --- LEITURA DOS DADOS DO TRIÂNGULO X ---
		System.out.println("Enter the measures of triangle X: ");
		// Lê os valores digitados pelo usuário e os armazena diretamente nos atributos do objeto 'x'.
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		// --- LEITURA DOS DADOS DO TRIÂNGULO Y ---
		System.out.println("Enter the measures of triangle Y: ");
		// Faz o mesmo para o objeto 'y'. Note como 'x' e 'y' têm seus próprios valores de a, b, c.
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		// --- CÁLCULO DAS ÁREAS ---
		// Chama o método 'area()' do objeto 'x'. O objeto 'x' executa o cálculo usando seus próprios lados.
		double areaX = x.area();
		
		// Chama o método 'area()' do objeto 'y'. O objeto 'y' executa o cálculo com seus lados.
		double areaY = y.area();

		// --- EXIBIÇÃO DOS RESULTADOS ---
		// Imprime os resultados formatados com 4 casas decimais.
		// '%n' cria uma nova linha.
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		// Compara as duas áreas calculadas para ver qual é a maior.
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		// Fecha o objeto Scanner para liberar os recursos do sistema. É uma boa prática.
		sc.close();
	}

}