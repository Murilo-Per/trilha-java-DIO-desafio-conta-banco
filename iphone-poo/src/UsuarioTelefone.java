import Mobile.Iphone;

public class UsuarioTelefone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        meuIphone.reproduzirCorreioVoz();
        meuIphone.atenderLigacao();
        meuIphone.realizarLigacao();

        meuIphone.selecionarMusica();
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();

        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
