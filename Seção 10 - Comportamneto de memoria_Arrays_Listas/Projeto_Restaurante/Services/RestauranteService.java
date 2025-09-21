<<<<<<< HEAD
package Services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Clientes;
import Entities.Funcionario;

public class RestauranteService {
	// O serviço agora "tem" as listas de clientes e funcionários
	// private List<Clientes> clientesCadastrados = new ArrayList<>();
	private List<Funcionario> funcionariosCadastrados = new ArrayList<>();
	private List<Product> produtosCadastrados = new ArrayList<Product>();
	
	LocalDateTime horario = LocalDateTime.now();
	
	
	public void CadastraFuncionario(Scanner sc) {
		System.out.println("\n --- Cadastro de Funcionario ---");
		sc.nextLine(); // limpar o buffer

		System.out.print("Nome do Colaborado: ");
		String nome = sc.nextLine();

		funcionariosCadastrados.add(new Funcionario(nome));
		System.out.println("--- Funcionario cadastrado com sucesso! ---");
		System.out.println("Processado: " + horario);
	}
	/*
	public void CadastrarClientes(Scanner sc) {
		System.out.println("\n --- Cadastro de Cliente ---");
		sc.nextLine(); // limpar o buffer

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Telefone Ex:(85988776644): ");
		String telefone = sc.nextLine();

		System.out.print("E-mail: ");
		String email = sc.nextLine();
		clientesCadastrados.add(new Clientes(nome, telefone, email));
		System.out.println("--- Funcionario cadastrado com sucesso! ---");
		System.out.println("Processado: " + horario);
	}*/

	public void CadastraProdutos(Scanner sc) {
		System.out.println("\n --- Cadastro de Produto ---");
		sc.nextLine(); // limpar o buffer
		try {
			System.out.print("Nome do Produto:  ");
			String nome = sc.nextLine();
			
			System.out.print("Valor do Produto: R$");
			double valor_Produto = sc.nextDouble();
			
			System.out.println("Quantidade (Ex1, 2): ");
			int qtde = sc.nextInt();
			
			if (valor_Produto <= 0 && qtde <= 0) {
				System.err.println("\nERRO! - Valor do produto não pode ser zero ou menor que zero! \n");
			}
			
			produtosCadastrados.add(new Product(nome, valor_Produto, qtde));
			System.out.println("\n--- Item cadastrado com sucesso! ---");
			System.out.println("Processado: " + horario);
			
		} catch (Exception e) {
			System.err.println("Erro - O que esta sendo digitado esta fora de parametro do sistema!");
		} finally {
			System.out.println("Executado script do sistema!");
			System.out.println("Processado: " + horario);
		}

	}

	public void AbrirContaMesa(Scanner sc) {
		System.out.println("\n--- Abrir Conta de Mesa ---");
		int id_Funcionario;

		while (true) {
			System.out.print("Digite o ID do funcionário: ");
			id_Funcionario = sc.nextInt();
			if (id_Funcionario > 0) {
				break; // Se o ID for positivo, sai do laço
			}
			// Se não, mostra o erro e o laço continua, pedindo o ID novamente.
			System.err.println("\nERRO: O ID do funcionário deve ser um número positivo.\n");
		}

		// --- BUSCA DO FUNCIONÁRIO (Seu código aqui já estava perfeito!) ---
		Funcionario funcionarioEncontrado = null;
		for (Funcionario f : this.funcionariosCadastrados) {
			if (f.getId() == id_Funcionario) {
				funcionarioEncontrado = f;
				break;
			}
		}

		// Verifica se o funcionário foi encontrado antes de prosseguir
		if (funcionarioEncontrado == null) {
			System.err.println("\nERRO: Funcionário com ID " + id_Funcionario + " não encontrado.");
			return; // 'return' aqui para o método, pois não podemos continuar sem funcionário.
		}

		// Se chegou até aqui, o funcionário existe.
		System.out.println("Mesa aberta pelo funcionário: " + funcionarioEncontrado.getFuncionario()); // Sugestão: usar
																										// getNome()

		// --- LÓGICA PARA ADICIONAR PRODUTOS (Exemplo) ---
		// (Esta parte é uma sugestão de como continuar)

		System.out.print("\nDigite o código do produto a ser adicionado (ou 0 para parar): ");
		int id_produto = sc.nextInt();

		// --- BUSCA DO PRODUTO (CORRIGIDO com 'break') ---
		Product produtoEncontrado = null;
		for (Product p : this.produtosCadastrados) {
			if (p.getId() == id_produto) {
				produtoEncontrado = p;
				break; // <-- OTIMIZAÇÃO: Para o laço assim que encontrar o produto.
			}
		}

		// Verifica se o produto foi encontrado
		if (produtoEncontrado != null) {
			System.out.println("Produto adicionado: " + produtoEncontrado.getNome_Produto());
			// Aqui você adicionaria o 'produtoEncontrado' à conta da mesa...
		} else {
			System.err.println("ERRO: Produto com código " + id_produto + " não encontrado.");
		}
		
		System.out.print("Informe a quantidade: ");
		int qtde = sc.nextInt();
	}
	
	public void SomaProdutos_Total(Scanner sc) {
		
	}
}
=======
package Services;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Clientes;
import Entities.Funcionario;

public class RestauranteService {
	// O serviço agora "tem" as listas de clientes e funcionários
	// private List<Clientes> clientesCadastrados = new ArrayList<>();
	private List<Funcionario> funcionariosCadastrados = new ArrayList<>();
	private List<Product> produtosCadastrados = new ArrayList<Product>();
	
	LocalDateTime horario = LocalDateTime.now();
	
	
	public void CadastraFuncionario(Scanner sc) {
		System.out.println("\n --- Cadastro de Funcionario ---");
		sc.nextLine(); // limpar o buffer

		System.out.print("Nome do Colaborado: ");
		String nome = sc.nextLine();

		funcionariosCadastrados.add(new Funcionario(nome));
		System.out.println("--- Funcionario cadastrado com sucesso! ---");
		System.out.println("Processado: " + horario);
	}
	/*
	public void CadastrarClientes(Scanner sc) {
		System.out.println("\n --- Cadastro de Cliente ---");
		sc.nextLine(); // limpar o buffer

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Telefone Ex:(85988776644): ");
		String telefone = sc.nextLine();

		System.out.print("E-mail: ");
		String email = sc.nextLine();
		clientesCadastrados.add(new Clientes(nome, telefone, email));
		System.out.println("--- Funcionario cadastrado com sucesso! ---");
		System.out.println("Processado: " + horario);
	}*/

	public void CadastraProdutos(Scanner sc) {
		System.out.println("\n --- Cadastro de Produto ---");
		sc.nextLine(); // limpar o buffer
		try {
			System.out.print("Nome do Produto:  ");
			String nome = sc.nextLine();
			
			System.out.print("Valor do Produto: R$");
			double valor_Produto = sc.nextDouble();
			
			System.out.println("Quantidade (Ex1, 2): ");
			int qtde = sc.nextInt();
			
			if (valor_Produto <= 0 && qtde <= 0) {
				System.err.println("\nERRO! - Valor do produto não pode ser zero ou menor que zero! \n");
			}
			
			produtosCadastrados.add(new Product(nome, valor_Produto, qtde));
			System.out.println("\n--- Item cadastrado com sucesso! ---");
			System.out.println("Processado: " + horario);
			
		} catch (Exception e) {
			System.err.println("Erro - O que esta sendo digitado esta fora de parametro do sistema!");
		} finally {
			System.out.println("Executado script do sistema!");
			System.out.println("Processado: " + horario);
		}

	}

	public void AbrirContaMesa(Scanner sc) {
		System.out.println("\n--- Abrir Conta de Mesa ---");
		int id_Funcionario;

		while (true) {
			System.out.print("Digite o ID do funcionário: ");
			id_Funcionario = sc.nextInt();
			if (id_Funcionario > 0) {
				break; // Se o ID for positivo, sai do laço
			}
			// Se não, mostra o erro e o laço continua, pedindo o ID novamente.
			System.err.println("\nERRO: O ID do funcionário deve ser um número positivo.\n");
		}

		// --- BUSCA DO FUNCIONÁRIO (Seu código aqui já estava perfeito!) ---
		Funcionario funcionarioEncontrado = null;
		for (Funcionario f : this.funcionariosCadastrados) {
			if (f.getId() == id_Funcionario) {
				funcionarioEncontrado = f;
				break;
			}
		}

		// Verifica se o funcionário foi encontrado antes de prosseguir
		if (funcionarioEncontrado == null) {
			System.err.println("\nERRO: Funcionário com ID " + id_Funcionario + " não encontrado.");
			return; // 'return' aqui para o método, pois não podemos continuar sem funcionário.
		}

		// Se chegou até aqui, o funcionário existe.
		System.out.println("Mesa aberta pelo funcionário: " + funcionarioEncontrado.getFuncionario()); // Sugestão: usar
																										// getNome()

		// --- LÓGICA PARA ADICIONAR PRODUTOS (Exemplo) ---
		// (Esta parte é uma sugestão de como continuar)

		System.out.print("\nDigite o código do produto a ser adicionado (ou 0 para parar): ");
		int id_produto = sc.nextInt();

		// --- BUSCA DO PRODUTO (CORRIGIDO com 'break') ---
		Product produtoEncontrado = null;
		for (Product p : this.produtosCadastrados) {
			if (p.getId() == id_produto) {
				produtoEncontrado = p;
				break; // <-- OTIMIZAÇÃO: Para o laço assim que encontrar o produto.
			}
		}

		// Verifica se o produto foi encontrado
		if (produtoEncontrado != null) {
			System.out.println("Produto adicionado: " + produtoEncontrado.getNome_Produto());
			// Aqui você adicionaria o 'produtoEncontrado' à conta da mesa...
		} else {
			System.err.println("ERRO: Produto com código " + id_produto + " não encontrado.");
		}
		
		System.out.print("Informe a quantidade: ");
		int qtde = sc.nextInt();
	}
	
	public void SomaProdutos_Total(Scanner sc) {
		
	}
}
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
