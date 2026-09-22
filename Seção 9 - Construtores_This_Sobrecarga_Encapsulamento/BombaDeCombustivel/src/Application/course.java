package Application;

import entities.BombaCombustivel;

import java.util.Locale;
import java.util.Scanner;

public class course {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BombaCombustivel bombaCombustivel = null;
        int escolhaMenu;
        do {
            System.out.println("** PITSTOP - Posto/Conveniencia");
            System.out.println("1 - Cadasta Combustivel\n" +
                    "2 - Abastecer\n" +
                    "3 - Alterar valor de combustivel\n" +
                    "4 - Verificar capacidade de Reservatorio\n" +
                    "5 - Desligar maquina");
            System.out.print("Opção: ");
            escolhaMenu = sc.nextInt();
            switch (escolhaMenu){
                case 1:
                    System.out.println("** Casdastro de Combustivel **");
                    System.out.println("Escolha o combustivel: \n" +
                            "1 - Gasolina\n" +
                            "2 - Diesel");
                    int escolhaCombustivel = sc.nextInt();
                    sc.nextLine();
                    String tipoCombustievel = "";
                    if (escolhaCombustivel == 1){
                        String gasolina = "Gasolina";
                        tipoCombustievel = gasolina;
                    } else {
                        String Diesel = "Diesel";
                        tipoCombustievel = Diesel;
                    }
                    System.out.print("Preço por Litro: ");
                    int precoLitro = sc.nextInt();
                    System.out.println("Deseja inserir já a quantidade de Litros no Reservatorio?\n" +
                            "S - SIM | N - NÃO");
                    char escolhaDeInserirCombustivel = sc.next().toLowerCase().charAt(0);
                    if (escolhaDeInserirCombustivel == 's'){
                        System.out.print("Quantidade à ser inserido no Reservatorio: ");
                        double qtdCombustivelNoReservatorio = sc.nextDouble();
                        bombaCombustivel = new BombaCombustivel(tipoCombustievel, precoLitro, qtdCombustivelNoReservatorio);
                    } else {
                        bombaCombustivel = new BombaCombustivel(tipoCombustievel, precoLitro);
                    }
                    break;
                case 2:
                    if (bombaCombustivel == null) {
                        System.err.println("Erro: Nenhuma bomba cadastrada no sistema! Vá na opção 1 primeiro.");
                        break;
                    }
                    System.out.println("** Abastecimento **");
                    // Mostramos ao cliente o tipo de combustível que essa bomba específica tem
                    System.out.println("Combustível disponível: " + bombaCombustivel.getTipoCombustivel());
                    System.out.print("\nQuanto deseja abastecer?\nValor: R$ ");
                    double valorAbastecimento = sc.nextDouble();
                    sc.nextLine();

                    // 2. Validação: Prende o utilizador aqui se ele digitar zero ou negativo
                    while (valorAbastecimento <= 0.0){
                        System.err.println("Valor inválido! Favor inserir um valor acima de ZERO.");
                        System.out.print("Valor: R$ ");
                        valorAbastecimento = sc.nextDouble();
                        sc.nextLine();
                    }

                    // 3. Ação: Quando sair do while, temos certeza que o valor é válido. Chamamos UMA VEZ.
                    bombaCombustivel.abastecerPorValor(valorAbastecimento);
                    break;
                case 3:
                    System.out.println("Em Desenvolvimento");
                    break;
                case 4:
                    if (bombaCombustivel != null) {
                        System.out.println("Status:\n" + bombaCombustivel);
                    } else {
                        System.out.println("A bomba ainda não foi registada! Vá à opção 1.");
                    }
                default:
                    System.out.println("Opereação realizada, retorando ao menu...");
            }
        } while (escolhaMenu != 5);
        System.out.println("Programa encerrado!");
        sc.close();
    }
}
