package entities;

/**
 * Este enum PÚBLICO define um conjunto fixo de programas de lavagem.
 * Por ser público e estar em seu próprio arquivo, ele pode ser acessado
 * por outras classes de outros pacotes, como a classe 'Program'.
 * Cada constante (DELICADO, NORMAL, PESADO) armazena seus próprios dados.
 */
public enum ProgramaLavagem {
    
    // Constantes do enum com seus respectivos valores associados
    DELICADO(30, 1),   // 30 minutos, nível de água 1
    NORMAL(60, 2),     // 60 minutos, nível de água 2
    PESADO(120, 3);    // 120 minutos, nível de água 3

    // Atributos para guardar os dados de cada constante
    private final int tempo;
    private final int nivelAgua;

    // Construtor do enum (usado internamente para criar as constantes acima)
    ProgramaLavagem(int tempo, int nivelAgua) {
        this.tempo = tempo;
        this.nivelAgua = nivelAgua;
    }

    // Métodos públicos para permitir que outras classes acessem os dados
    public int getTempo() {
        return tempo;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }
}