package IPhone;

import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorDeInternet;
import Interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical,  NavegadorDeInternet {
    public void ligar() {
        System.out.println("Realizando uma ligação...");   
    }

    public void atender() {
        System.out.println("Atendendo uma ligação...");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Deixando uma mensagem de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    public void tocar() {
        System.out.println("Tocando uma música...");
    }

    public void pausar() {
        System.out.println("Pausando a música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando uma música...");
    }
}