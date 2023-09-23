package Banco.Contas;


import Banco.Clientes.Cliente;

public class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valorSaque) {
        this.saldo -= valorSaque;
    }

    @Override
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    @Override
    public void tranferirInterno(double valorTransferir, IConta contaDestino) {
        this.sacar(valorTransferir);
        contaDestino.depositar(valorTransferir);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("agencia = " + this.agencia);
        System.out.println("numero  = " + this.numero);
        System.out.println("saldo   = " + this.saldo);
    }
}
