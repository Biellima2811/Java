package entities;

public class Personagem {
    private String nome;
    private int vidaAtual, vidaMaxima;

    public Personagem(String nome, int vidaMaxima) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = this.vidaMaxima;
    }

    public void tomarDano(int dano){
        if (dano <= 0){
            System.out.println("O dano deve ser maior que zero.");
            return;
        }
        this.vidaAtual -= dano;
        if (this.vidaAtual < 0){
            this.vidaAtual = 0;
            System.out.printf("Dano fatal de %d sofrido. Player %s Fora do Jogo!%n", dano, nome);
        } else {
            System.out.printf("Dano sofrido: %d | Personagem: %s - Vida Atual: %d%n", dano, nome, vidaAtual);
        }
    }

    public void beberPocao(int cura){
        if (cura <= 0) {
            System.out.println("O valor da poção tem de ser maior que zero.");
            return;
        }

        this.vidaAtual += cura;


        if (this.vidaAtual > this.vidaMaxima){
            this.vidaAtual = this.vidaMaxima;
        }

        System.out.printf("Curou %d pontos de vida.%n", cura);
    }

    public String getNome() {
        return nome;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    @Override
    public String toString() {
        return "Personagem: " + nome + " (HP: "
                + vidaAtual + " / " + vidaMaxima + " )";
    }
}
