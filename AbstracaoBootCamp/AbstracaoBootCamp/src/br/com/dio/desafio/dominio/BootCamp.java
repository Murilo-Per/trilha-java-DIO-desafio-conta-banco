package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public BootCamp() {
        this.dataInicial = LocalDate.now();
        this.dataFinal = dataInicial.plusDays(45);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descricao, bootCamp.descricao) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(conteudosBootcamp, bootCamp.conteudosBootcamp) && Objects.equals(devsInscritos, bootCamp.devsInscritos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, conteudosBootcamp, devsInscritos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Set<Conteudo> getConteudosBootcamp() {
        return conteudosBootcamp;
    }

    public void setConteudosBootcamp(Set<Conteudo> conteudosBootcamp) {
        this.conteudosBootcamp = conteudosBootcamp;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

}
