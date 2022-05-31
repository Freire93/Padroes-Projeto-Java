package Facade;

import SubSistema1.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facade {
    public void migrarClientes(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
