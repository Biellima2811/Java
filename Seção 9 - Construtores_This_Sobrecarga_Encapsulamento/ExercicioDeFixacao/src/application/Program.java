package application;

import entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBanco accontNewBank;
        System.out.println("** New Accont **");
        System.out.print("Enter account number: ");
        int numAccont = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?: ");
        char opcao = sc.next().toUpperCase().charAt(0);
        if (opcao == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double valueDeposit = sc.nextDouble();
            accontNewBank = new ContaBanco(numAccont, name, valueDeposit);
            System.out.println("Accont Data:\n " + accontNewBank);
        } else {
            accontNewBank = new ContaBanco(numAccont, name);
            System.out.println("Accont Data:\n " +  accontNewBank);
        }
        System.out.print("Enter a deposit value: ");
        double valueDeposit = sc.nextDouble();
        accontNewBank.deposit(valueDeposit);
        System.out.println("Accont Data: \n" + accontNewBank);

        System.out.print("Enter a withdraw value: ");
        double withdrawMoney = sc.nextDouble();
        accontNewBank.withdraw(withdrawMoney);
        System.out.println("Accont Data: \n" + accontNewBank);

        sc.close();
    }
}
