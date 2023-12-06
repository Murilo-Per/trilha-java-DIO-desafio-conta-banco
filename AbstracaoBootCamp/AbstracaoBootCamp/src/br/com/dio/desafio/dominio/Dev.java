package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String Nome;
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosFinalizados = new LinkedHashSet<>();

    @Override
    public String toString() {
        return "Dev{" +
                "Nome='" + Nome + '\'' +
                ", Conteudos Inscritos=" + conteudosInscritos +
                ", Conteudos Finalizados=" + conteudosFinalizados +
                ", Xp Atual=" + CalcularTotalXp() +
                '}';
    }

    public Dev(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void InscreverBootCamp(BootCamp bootCamp){
        conteudosInscritos.addAll(bootCamp.getConteudosBootcamp());
        bootCamp.getDevsInscritos().add(this);
    }

    public void Progredir(){
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            conteudosFinalizados.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }
    }

    public double CalcularTotalXp(){
        return conteudosFinalizados
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(Nome, dev.Nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosFinalizados, dev.conteudosFinalizados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, conteudosInscritos, conteudosFinalizados);
    }
}
