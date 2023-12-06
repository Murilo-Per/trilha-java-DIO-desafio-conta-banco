import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        BootCamp formacaoJava = new BootCamp();
        formacaoJava.setNome("Formação Dev Java");
        formacaoJava.setDescricao("Formação de desenvolvedores com a linguagem JAVA");
        formacaoJava.getConteudosBootcamp().add(new Curso("Logica de Programação","Curso de Logica com Java", 10));
        formacaoJava.getConteudosBootcamp().add(new Curso("Curso Java","Curso em Java", 20));
        formacaoJava.getConteudosBootcamp()
                .add(new Mentoria("Mentoria Java","Mentoria de desenvolvimento em Java",
                                   LocalDate.now()));

        Dev devMurilo = new Dev("Murilo");
        devMurilo.InscreverBootCamp(formacaoJava);
        System.out.println(devMurilo);
        devMurilo.Progredir();
        System.out.println("-- Realizou progressão --");
        System.out.println(devMurilo);
        devMurilo.Progredir();
        System.out.println("-- Realizou progressão 2--");
        System.out.println(devMurilo);
    }
}
