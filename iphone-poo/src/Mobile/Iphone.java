package Mobile;

import Software.NavegadorWeb;
import Software.ReprodutorMusical;
import Software.Telefone;

public class Iphone implements NavegadorWeb, ReprodutorMusical, Telefone {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina da internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina da internet");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }

    @Override
    public void realizarLigacao() {
        System.out.println("Iniciando ligação");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void reproduzirCorreioVoz() {
        System.out.println("Reproduzindo Correio de Voz");
    }
}