package contabancaria;

import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler entradas do usuário via terminal
        Scanner scanner = new Scanner(System.in);
        // Define que o separador de entrada será a quebra de linha (\n)
        scanner.useDelimiter("\\n");
        // Define o locale como US para garantir que o separador decimal seja o ponto (.)
        scanner.useLocale(java.util.Locale.US);

        // Solicita o número da agência e armazena na variável 'agencia'
        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        // Solicita o número da conta e armazena na variável 'conta'
        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        // Solicita o nome do cliente e armazena na variável 'nome'
        System.out.println("Digite o seu nome:");
        String nome = scanner.next();

        // Solicita o saldo inicial e armazena na variável 'saldo'
        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Formata a mensagem com os valores primeiro
        String mensagem = String.format(
                "Olá, %s!\nObrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é %s, sua conta %d e o seu saldo R$ %,.2f já está disponível para saque.",
                nome, agencia, conta, saldo
        );

        // Exibe a mensagem formatada
        System.out.println(mensagem);

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
