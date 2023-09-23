package Banco;

import Banco.Clientes.Cliente;
import Banco.Contas.ContaCorrente;
import Banco.Contas.ContaPoupanca;
import Banco.Exceptions.OpcaoInvalidaException;

import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String nomeCliente;
        int acaoEscolhida;
        double saldo;
        Banco banco = new Banco();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o seu nome:");
        nomeCliente = scanner.nextLine();

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nomeCliente);

        try {
            System.out.println(MessageFormat.format("Olá {0} qual operação deseja fazer?", novoCliente.getNome()));
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupanca");
            acaoEscolhida = scanner.nextInt();

            if (acaoEscolhida == 1) {
               banco.setConta(new ContaCorrente(novoCliente));
            } else if (acaoEscolhida == 2) {
                banco.setConta(new ContaPoupanca(novoCliente));
            } else throw new OpcaoInvalidaException();

            System.out.println("Qual operação deseja fazer?");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("4 - Extrato");
            acaoEscolhida = scanner.nextInt();

            switch (acaoEscolhida) {
                case 1 -> {
                    System.out.println("Agora informe o valor a depositar:");
                    banco.getConta().depositar(scanner.nextDouble());
                }
                case 2 -> {
                    System.out.println("Agora informe o valor desejado para saque:");
                    banco.getConta().sacar(scanner.nextDouble());
                }
                case 3 -> {
                    banco.getConta().imprimirExtrato();
                }
                default -> throw new OpcaoInvalidaException();
            }

            System.out.println(MessageFormat.format(
                    "Prezado {0}, obrigado por criar uma conta em nosso banco!"
                    , nomeCliente)
            );
        } catch (OpcaoInvalidaException e) {
            System.out.println("Opção Inválida!");
        }
    }
}