import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;
        int opcao;

        do {
            System.out.println("\n=== CAIXA ELETRONICO ===");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Deposito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Opcao invalida. Digite um numero de 1 a 4.");
                scanner.next();
                System.out.print("Escolha uma opcao: ");
            }

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.printf("Saldo atual: R$ %.2f%n", saldo);
            } else if (opcao == 2) {
                System.out.print("Digite o valor do deposito: R$ ");

                while (!scanner.hasNextDouble()) {
                    System.out.println("Valor invalido. Digite um numero.");
                    scanner.next();
                    System.out.print("Digite o valor do deposito: R$ ");
                }

                double deposito = scanner.nextDouble();

                if (deposito > 0) {
                    saldo = saldo + deposito;
                    System.out.printf("Deposito realizado. Saldo atual: R$ %.2f%n", saldo);
                } else {
                    System.out.println("Valor invalido.");
                }
            } else if (opcao == 3) {
                System.out.print("Digite o valor do saque: R$ ");

                while (!scanner.hasNextDouble()) {
                    System.out.println("Valor invalido. Digite um numero.");
                    scanner.next();
                    System.out.print("Digite o valor do saque: R$ ");
                }

                double saque = scanner.nextDouble();

                if (saque <= 0) {
                    System.out.println("Valor invalido.");
                } else if (saque <= saldo) {
                    saldo = saldo - saque;
                    System.out.printf("Saque realizado. Saldo atual: R$ %.2f%n", saldo);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else if (opcao == 4) {
                System.out.println("Sessao encerrada.");
            } else {
                System.out.println("Opcao invalida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
