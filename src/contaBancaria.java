import java.util.Scanner;

public class contaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Ver saldo");
            System.out.println("0. Encerrar programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Depósito de " + valorDeposito + " realizado com sucesso.\n");
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque de " + valorSaque + " realizado com sucesso.\n");
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.\n");
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo+"\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado.\n");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}