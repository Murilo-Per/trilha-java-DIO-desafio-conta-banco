package Banco;

import Banco.Contas.Conta;

public class Banco {

    private String nome;
    private Conta conta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta contaSelecionada) {
        this.conta = contaSelecionada;
    }

}
