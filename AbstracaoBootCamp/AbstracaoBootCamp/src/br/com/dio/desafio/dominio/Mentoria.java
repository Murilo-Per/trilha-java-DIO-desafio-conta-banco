package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate dataMentoria;

    public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
        super(titulo, descricao);
        this.setDataMentoria(dataMentoria);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public void setDataMentoria(LocalDate dataMentoria) {
        this.dataMentoria = dataMentoria;
    }

    public LocalDate getDataMentoria() {
        return dataMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Nome=" + getTitulo() +
                '}';
    }
}
