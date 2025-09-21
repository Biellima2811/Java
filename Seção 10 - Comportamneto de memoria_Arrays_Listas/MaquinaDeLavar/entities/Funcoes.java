<<<<<<< HEAD
<<<<<<< HEAD
package entities;

// Importa o enum que acabamos de criar para poder usá-lo como um tipo de atributo.
import entities.ProgramaLavagem;

/**
 * Esta classe representa o objeto Máquina de Lavar.
 * Ela encapsula (protege) seus dados e oferece métodos públicos para interagir com eles.
 */
public class Funcoes {

    // Atributos que definem o estado da máquina. São 'private' para encapsulamento.
    private boolean ligada;
    private boolean tampaFechada;
    private boolean lavando;
    private ProgramaLavagem programaSelecionado;

    /**
     * CONSTRUTOR: Método especial executado ao criar um objeto com 'new Funcoes()'.
     * Define o estado inicial padrão da máquina.
     */
    public Funcoes() {
        this.ligada = false;
        this.tampaFechada = false;
        this.lavando = false;
        this.programaSelecionado = null;
        System.out.println("Máquina de lavar criada. Status inicial: Desligada, Porta aberta.");
    }

    // --- MÉTODOS PÚBLICOS (AÇÕES DA MÁQUINA) ---

    public void ligar() {
        if (!ligada) {
            this.ligada = true;
            System.out.println("Máquina de Lavar está ligada!");
        } else {
            System.out.println("A máquina já está ligada.");
        }
    }

    public void desligar() {
        if (ligada && !lavando) {
            this.ligada = false;
            System.out.println("Máquina de lavar desligada.");
        } else if (lavando) {
            System.err.println("ERRO: Impossível desligar durante uma lavagem.");
        } else {
            System.out.println("A máquina já está desligada.");
        }
    }

    public void fecharPorta() {
        if (!tampaFechada) {
            this.tampaFechada = true;
            System.out.println("Porta fechada.");
        }
    }

    public void abrirPorta() {
        if (tampaFechada && !lavando) {
            this.tampaFechada = false;
            System.out.println("Porta aberta.");
        } else if (lavando) {
            System.err.println("ERRO: A porta está travada durante a lavagem.");
        }
    }

    public void selecionarPrograma(ProgramaLavagem programa) {
        if (ligada && !lavando) {
            this.programaSelecionado = programa;
            System.out.println("Programa selecionado: " + this.programaSelecionado);
        } else {
            System.err.println("ERRO: A máquina precisa estar ligada e não pode estar lavando para selecionar um programa.");
        }
    }

    public void iniciarLavagem() {
        if (ligada && tampaFechada && programaSelecionado != null && !lavando) {
            this.lavando = true;

            int tempoLavagem = this.programaSelecionado.getTempo();
            int nivelAgua = this.programaSelecionado.getNivelAgua();

            System.out.println("\nIniciando lavagem no programa: " + this.programaSelecionado);
            System.out.println("Tempo estimado: " + tempoLavagem + " minutos.");
            System.out.println("Nível de água automático: " + nivelAgua);
            
            System.out.println("...Lavagem em andamento...");
            System.out.println("...Lavagem concluída!");
            this.lavando = false;
            
        } else {
            System.err.println("\n--- ERRO AO INICIAR LAVAGEM ---");
            if (!ligada) System.err.println("- A máquina está desligada.");
            if (!tampaFechada) System.err.println("- A porta está aberta.");
            if (programaSelecionado == null) System.err.println("- Nenhum programa foi selecionado.");
            if (lavando) System.err.println("- A máquina já está em um ciclo de lavagem.");
        }
    }

    public void exibirStatus() {
        System.out.println("\n--- STATUS DA MÁQUINA ---");
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Porta Fechada: " + (tampaFechada ? "Sim" : "Não"));
        System.out.println("Lavando: " + (lavando ? "Sim" : "Não"));
        System.out.println("Programa Selecionado: " + (programaSelecionado != null ? programaSelecionado : "Nenhum"));
        System.out.println("---------------------------\n");
    }
=======
package entities;

// Importa o enum que acabamos de criar para poder usá-lo como um tipo de atributo.
import entities.ProgramaLavagem;

/**
 * Esta classe representa o objeto Máquina de Lavar.
 * Ela encapsula (protege) seus dados e oferece métodos públicos para interagir com eles.
 */
public class Funcoes {

    // Atributos que definem o estado da máquina. São 'private' para encapsulamento.
    private boolean ligada;
    private boolean tampaFechada;
    private boolean lavando;
    private ProgramaLavagem programaSelecionado;

    /**
     * CONSTRUTOR: Método especial executado ao criar um objeto com 'new Funcoes()'.
     * Define o estado inicial padrão da máquina.
     */
    public Funcoes() {
        this.ligada = false;
        this.tampaFechada = false;
        this.lavando = false;
        this.programaSelecionado = null;
        System.out.println("Máquina de lavar criada. Status inicial: Desligada, Porta aberta.");
    }

    // --- MÉTODOS PÚBLICOS (AÇÕES DA MÁQUINA) ---

    public void ligar() {
        if (!ligada) {
            this.ligada = true;
            System.out.println("Máquina de Lavar está ligada!");
        } else {
            System.out.println("A máquina já está ligada.");
        }
    }

    public void desligar() {
        if (ligada && !lavando) {
            this.ligada = false;
            System.out.println("Máquina de lavar desligada.");
        } else if (lavando) {
            System.err.println("ERRO: Impossível desligar durante uma lavagem.");
        } else {
            System.out.println("A máquina já está desligada.");
        }
    }

    public void fecharPorta() {
        if (!tampaFechada) {
            this.tampaFechada = true;
            System.out.println("Porta fechada.");
        }
    }

    public void abrirPorta() {
        if (tampaFechada && !lavando) {
            this.tampaFechada = false;
            System.out.println("Porta aberta.");
        } else if (lavando) {
            System.err.println("ERRO: A porta está travada durante a lavagem.");
        }
    }

    public void selecionarPrograma(ProgramaLavagem programa) {
        if (ligada && !lavando) {
            this.programaSelecionado = programa;
            System.out.println("Programa selecionado: " + this.programaSelecionado);
        } else {
            System.err.println("ERRO: A máquina precisa estar ligada e não pode estar lavando para selecionar um programa.");
        }
    }

    public void iniciarLavagem() {
        if (ligada && tampaFechada && programaSelecionado != null && !lavando) {
            this.lavando = true;

            int tempoLavagem = this.programaSelecionado.getTempo();
            int nivelAgua = this.programaSelecionado.getNivelAgua();

            System.out.println("\nIniciando lavagem no programa: " + this.programaSelecionado);
            System.out.println("Tempo estimado: " + tempoLavagem + " minutos.");
            System.out.println("Nível de água automático: " + nivelAgua);
            
            System.out.println("...Lavagem em andamento...");
            System.out.println("...Lavagem concluída!");
            this.lavando = false;
            
        } else {
            System.err.println("\n--- ERRO AO INICIAR LAVAGEM ---");
            if (!ligada) System.err.println("- A máquina está desligada.");
            if (!tampaFechada) System.err.println("- A porta está aberta.");
            if (programaSelecionado == null) System.err.println("- Nenhum programa foi selecionado.");
            if (lavando) System.err.println("- A máquina já está em um ciclo de lavagem.");
        }
    }

    public void exibirStatus() {
        System.out.println("\n--- STATUS DA MÁQUINA ---");
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Porta Fechada: " + (tampaFechada ? "Sim" : "Não"));
        System.out.println("Lavando: " + (lavando ? "Sim" : "Não"));
        System.out.println("Programa Selecionado: " + (programaSelecionado != null ? programaSelecionado : "Nenhum"));
        System.out.println("---------------------------\n");
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
=======
package entities;

// Importa o enum que acabamos de criar para poder usá-lo como um tipo de atributo.
import entities.ProgramaLavagem;

/**
 * Esta classe representa o objeto Máquina de Lavar.
 * Ela encapsula (protege) seus dados e oferece métodos públicos para interagir com eles.
 */
public class Funcoes {

    // Atributos que definem o estado da máquina. São 'private' para encapsulamento.
    private boolean ligada;
    private boolean tampaFechada;
    private boolean lavando;
    private ProgramaLavagem programaSelecionado;

    /**
     * CONSTRUTOR: Método especial executado ao criar um objeto com 'new Funcoes()'.
     * Define o estado inicial padrão da máquina.
     */
    public Funcoes() {
        this.ligada = false;
        this.tampaFechada = false;
        this.lavando = false;
        this.programaSelecionado = null;
        System.out.println("Máquina de lavar criada. Status inicial: Desligada, Porta aberta.");
    }

    // --- MÉTODOS PÚBLICOS (AÇÕES DA MÁQUINA) ---

    public void ligar() {
        if (!ligada) {
            this.ligada = true;
            System.out.println("Máquina de Lavar está ligada!");
        } else {
            System.out.println("A máquina já está ligada.");
        }
    }

    public void desligar() {
        if (ligada && !lavando) {
            this.ligada = false;
            System.out.println("Máquina de lavar desligada.");
        } else if (lavando) {
            System.err.println("ERRO: Impossível desligar durante uma lavagem.");
        } else {
            System.out.println("A máquina já está desligada.");
        }
    }

    public void fecharPorta() {
        if (!tampaFechada) {
            this.tampaFechada = true;
            System.out.println("Porta fechada.");
        }
    }

    public void abrirPorta() {
        if (tampaFechada && !lavando) {
            this.tampaFechada = false;
            System.out.println("Porta aberta.");
        } else if (lavando) {
            System.err.println("ERRO: A porta está travada durante a lavagem.");
        }
    }

    public void selecionarPrograma(ProgramaLavagem programa) {
        if (ligada && !lavando) {
            this.programaSelecionado = programa;
            System.out.println("Programa selecionado: " + this.programaSelecionado);
        } else {
            System.err.println("ERRO: A máquina precisa estar ligada e não pode estar lavando para selecionar um programa.");
        }
    }

    public void iniciarLavagem() {
        if (ligada && tampaFechada && programaSelecionado != null && !lavando) {
            this.lavando = true;

            int tempoLavagem = this.programaSelecionado.getTempo();
            int nivelAgua = this.programaSelecionado.getNivelAgua();

            System.out.println("\nIniciando lavagem no programa: " + this.programaSelecionado);
            System.out.println("Tempo estimado: " + tempoLavagem + " minutos.");
            System.out.println("Nível de água automático: " + nivelAgua);
            
            System.out.println("...Lavagem em andamento...");
            System.out.println("...Lavagem concluída!");
            this.lavando = false;
            
        } else {
            System.err.println("\n--- ERRO AO INICIAR LAVAGEM ---");
            if (!ligada) System.err.println("- A máquina está desligada.");
            if (!tampaFechada) System.err.println("- A porta está aberta.");
            if (programaSelecionado == null) System.err.println("- Nenhum programa foi selecionado.");
            if (lavando) System.err.println("- A máquina já está em um ciclo de lavagem.");
        }
    }

    public void exibirStatus() {
        System.out.println("\n--- STATUS DA MÁQUINA ---");
        System.out.println("Ligada: " + (ligada ? "Sim" : "Não"));
        System.out.println("Porta Fechada: " + (tampaFechada ? "Sim" : "Não"));
        System.out.println("Lavando: " + (lavando ? "Sim" : "Não"));
        System.out.println("Programa Selecionado: " + (programaSelecionado != null ? programaSelecionado : "Nenhum"));
        System.out.println("---------------------------\n");
    }
>>>>>>> 8fb625f8685bb9d173f47b761d5fa7554056af9e
}