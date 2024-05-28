import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1: Depositar");
            System.out.println("2: Sacar");
            System.out.println("3: Ver Saldo");
            System.out.println("0: Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Valor depositado com sucesso. Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Valor sacado com sucesso. Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente. Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
