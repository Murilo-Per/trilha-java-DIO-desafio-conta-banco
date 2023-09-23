package Banco.Contas;

public interface IConta {
    void sacar(double valorSaque);

    void depositar(double valorDeposito);

    void tranferirInterno(double valorTransferir, IConta contaDestino);

    void imprimirExtrato();
}
