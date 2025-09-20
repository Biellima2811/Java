<<<<<<< HEAD
package application;

// Importa as classes do pacote 'entities' para poder usá-las.
import entities.Funcoes;
import entities.ProgramaLavagem;

public class Program {

    public static void main(String[] args) {

        // Cria um objeto (instância) da classe Funcoes. O construtor é chamado aqui.
        Funcoes minhaMaquina = new Funcoes();

        // --- Simulação de Uso ---

        // Tentativa 1: Tentar usar a máquina sem prepará-la. Deve mostrar os erros.
        System.out.println("\n>>> TENTATIVA 1: Tentar iniciar a lavagem sem preparar nada.");
        minhaMaquina.iniciarLavagem();
        minhaMaquina.exibirStatus();
        /*
        // Tentativa 2: Sequência correta para usar a máquina.
        System.out.println("\n>>> TENTATIVA 2: Sequência correta de uso.");
        minhaMaquina.ligar();
        minhaMaquina.fecharPorta();
        minhaMaquina.selecionarPrograma(ProgramaLavagem.PESADO); // Seleciona um programa do enum
        minhaMaquina.exibirStatus();

        System.out.println(">>> Agora sim, iniciando a lavagem!");
        minhaMaquina.iniciarLavagem();
        minhaMaquina.exibirStatus(); // Mostra o status final após a lavagem*/
    }
=======
package application;

// Importa as classes do pacote 'entities' para poder usá-las.
import entities.Funcoes;
import entities.ProgramaLavagem;

public class Program {

    public static void main(String[] args) {

        // Cria um objeto (instância) da classe Funcoes. O construtor é chamado aqui.
        Funcoes minhaMaquina = new Funcoes();

        // --- Simulação de Uso ---

        // Tentativa 1: Tentar usar a máquina sem prepará-la. Deve mostrar os erros.
        System.out.println("\n>>> TENTATIVA 1: Tentar iniciar a lavagem sem preparar nada.");
        minhaMaquina.iniciarLavagem();
        minhaMaquina.exibirStatus();
        /*
        // Tentativa 2: Sequência correta para usar a máquina.
        System.out.println("\n>>> TENTATIVA 2: Sequência correta de uso.");
        minhaMaquina.ligar();
        minhaMaquina.fecharPorta();
        minhaMaquina.selecionarPrograma(ProgramaLavagem.PESADO); // Seleciona um programa do enum
        minhaMaquina.exibirStatus();

        System.out.println(">>> Agora sim, iniciando a lavagem!");
        minhaMaquina.iniciarLavagem();
        minhaMaquina.exibirStatus(); // Mostra o status final após a lavagem*/
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}