package entities;

public class BombaCombustivel {
    private String tipoCombustivel;
    private int precoPorLitro;
    private double quantidadeNoReservatorio;
    private final int SENHA_AUTORZA = 1234;

    public BombaCombustivel(String tipoCombustivel, int precoPorLitro, double quantidadeNoReservatorio) {
        this.tipoCombustivel = tipoCombustivel;
        this.precoPorLitro = precoPorLitro;
        this.quantidadeNoReservatorio = quantidadeNoReservatorio;
    }

    public BombaCombustivel(String tipoCombustivel, int precoPorLitro) {
        this.tipoCombustivel = tipoCombustivel;
        this.precoPorLitro = precoPorLitro;
    }


    public void encherReservatorio(double litros){
        if (litros > 0){
            this.quantidadeNoReservatorio += litros;
            System.out.printf("Sucesso: %.2f litro(s) adicionado(s) ao reservatorio.%n", litros);
            System.out.println("Quantidade atual: " + this.quantidadeNoReservatorio + " litros no tanque.");
        } else {
            System.err.println("Erro: A quantidade de litros para abastecer deve ser maior que zero.");
        }
    }

    public void abastecerPorValor(double valorPago){
        if (valorPago <= 0){
            System.err.println("Erro: O valor para abastecer deve ser maior que zero.");
            return;
        }
        if (this.precoPorLitro <= 0){
            System.err.println("Erro: O preço do litro não está configurado na bomba.");
            return;
        }
        double quantidadeDeLitro = valorPago / this.precoPorLitro;

        if (quantidadeDeLitro > this.quantidadeNoReservatorio){
            System.err.println("Erro: Reservatório insuficiente. Faltam litros na bomba.");
            return;
        }
        this.quantidadeNoReservatorio -= quantidadeDeLitro;
        System.out.printf("Sucesso! Valor pago: R$%.2f - Quantidade de litros abastecida: %.2f%n", valorPago, quantidadeDeLitro);
    }

    public int getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(int novoPreco, int senhaAutoriza) {
        int chaveMestre = SENHA_AUTORZA;
        if (novoPreco < 0){
            System.out.println("Erro: O preço do litro deve ser maior que zero!");
        } else {
            if (senhaAutoriza == SENHA_AUTORZA){
                this.precoPorLitro = novoPreco;
                System.out.printf("Preço alterado com sucesso para R$ %.2f por litro.%n", (double) novoPreco);
            }
        }
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public double getQuantidadeNoReservatorio() {
        return quantidadeNoReservatorio;
    }

    public void setQuantidadeNoReservatorio(double quantidadeNoReservatorio) {
        this.quantidadeNoReservatorio = quantidadeNoReservatorio;
    }

    public int getSENHA_AUTORZA() {
        return SENHA_AUTORZA;
    }

    @Override
    public String toString() {
        return "BombaCombustivel{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", precoPorLitro=" + precoPorLitro +
                ", quantidadeNoReservatorio=" + quantidadeNoReservatorio +
                '}';
    }
}
