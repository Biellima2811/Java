package application;

// Importa classes úteis para o programa
import java.text.ParseException; // Classe para tratar possíveis erros na conversão de texto para data
import java.text.SimpleDateFormat; // Classe para formatar e converter datas
import java.util.Date; // Classe para representar datas
import java.util.Locale; // Para configurar a formatação de números (padrão americano)
import java.util.Scanner; // Para ler a entrada do usuário no console

// Importa as nossas classes de entidade
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
    // O 'throws ParseException' na assinatura do main indica que o método sdf.parse()
    // pode lançar um erro de conversão, e estamos cientes disso.
	public static void main(String[] args) throws ParseException {
        // --- SEÇÃO DE CONFIGURAÇÃO INICIAL ---
		Locale.setDefault(Locale.US); // Garante que o ponto '.' seja usado como separador decimal
		Scanner sc = new Scanner(System.in);
        // Cria um formatador de data. Ele vai entender datas no formato "dia/mês/ano".
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		// --- SEÇÃO 1: COLETA DE DADOS DO DEPARTAMENTO E TRABALHADOR ---
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();

		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();

		// --- SEÇÃO 2: SELEÇÃO DO NÍVEL DO TRABALHADOR ---
		System.out.println("Level:");
		int L = 1;
		for (WorkerLevel status : WorkerLevel.values()) {
			System.out.println(L + " - " + status);
			++L;
		}

		System.out.print("Informe o digito correspondente ao level: ");
		int workerLevel = sc.nextInt();

		if (workerLevel < 1 || workerLevel > WorkerLevel.values().length) {
			System.out.println("Invalid index for WorkerLevel enum.");
			return; 
		}

		System.out.print("Base salary: R$");
		double baseSalary = sc.nextDouble();

		// --- SEÇÃO 3: CRIAÇÃO DO OBJETO 'WORKER' ---
		Worker worker = new Worker(workerName, 
                                   WorkerLevel.fromInt(workerLevel),
				                   baseSalary, 
                                   new Department(departmentName));

		// --- SEÇÃO 4: REGISTRO DOS CONTRATOS (AGORA COMPLETA) ---
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();

        // Loop corrigido para rodar 'n' vezes (de 0 a n-1)
		for (int i = 0; i < n; i++) {
            // Exibe o número do contrato de forma amigável (1, 2, 3...)
			System.out.println("Enter contract #" + (i + 1) + " data:"); 
			System.out.print("Date (DD/MM/YYYY): ");
            // Lê a data como texto e a converte (parse) para um objeto Date usando o formato definido
			Date contractDate = sdf.parse(sc.next());

			System.out.print("Value per hour: R$");
			double valuePerHour = sc.nextDouble();

			System.out.print("Duration (hours): "); // Corrigido de println para print
			int hours = sc.nextInt();

            // Cria um novo objeto HourContract com os dados lidos
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			
            // Adiciona o contrato recém-criado à lista de contratos do trabalhador
            worker.addContract(contract);
		}
		
        System.out.println(); // Pula uma linha para melhor formatação
		
        // --- SEÇÃO 5: CÁLCULO E EXIBIÇÃO DO RESULTADO ---
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = sc.next(); // Lê o texto "MM/YYYY"
        
        // Pega os dois primeiros caracteres (o mês) e converte para inteiro
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
        // Pega os caracteres a partir da posição 3 (o ano) e converte para inteiro
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
        
        // Exibe o resultado formatado.
        // %s -> substitui por uma String (monthAndYear)
        // %.2f -> substitui por um número de ponto flutuante com 2 casas decimais (worker.income)
        // %n -> pula uma linha
		System.out.printf("Income for %s: R$%.2f%n", monthAndYear, worker.income(year, month));
		
		sc.close(); // Fecha o Scanner para liberar recursos
	}
}
