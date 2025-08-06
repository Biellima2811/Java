package Services;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Entities.Clientes;
import Entities.Funcionario;

public class RestauranteService {
	// O serviço agora "tem" as listas de clientes e funcionários
	private List<Clientes> clientesCadastrados = new ArrayList<>();
    private List<Funcionario> funcionariosCadastrados = new ArrayList<>();
    LocalDateTime horario = LocalDateTime.now();
    
    public void CadastraFuncionario(Scanner sc) {
		System.out.println("\n --- Cadastro de Funcionario ---");
		sc.nextLine(); // limpar o buffer
		
		System.out.print("Nome do Colaborado: ");
		String nome = sc.nextLine();
		
		funcionariosCadastrados.add(new Funcionario(nome));
		System.out.println("--- Funcionario cadastrado com sucesso! ---");
		System.out.println("Processado: " +  horario);
	}
    
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
		System.out.println("Processado: " +  horario);
	}
}
