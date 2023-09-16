import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Integer contaNumero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o número da agência:");
        agencia = scanner.nextLine();

        System.out.println("Agora informe o numero da conta:");
        contaNumero = scanner.nextInt();

        System.out.println("Agora informe o valor a depositar:");
        saldo = scanner.nextDouble();

        System.out.println(MessageFormat.format(
                "Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}," +
                " conta {2} e seu saldo {3} já está disponível para saque!"
                , nomeCliente, agencia, contaNumero, saldo)
        );


    }
}