package application;

import entities.Personagem;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Personagem personagem1 = new Personagem("Guerreiro", 120);
        System.out.println("\n" + personagem1);
        personagem1.tomarDano(119);
        System.out.println("\n" + personagem1);
        personagem1.beberPocao(120);
        System.out.println("\n" + personagem1);
        sc.close();
    }
}
