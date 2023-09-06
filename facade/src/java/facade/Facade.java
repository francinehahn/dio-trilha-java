package src.java.facade;

import src.java.subsistema1.crm.CrmService;
import src.java.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        CepApi cepApi = CepApi.getInstancia();
        String cidade = cepApi.recuperarCidade(cep);
        String estado = cepApi.recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);

        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}