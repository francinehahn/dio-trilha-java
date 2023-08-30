import IPhone.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorrerioVoz();
        
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.exibirPagina();
    }
}
