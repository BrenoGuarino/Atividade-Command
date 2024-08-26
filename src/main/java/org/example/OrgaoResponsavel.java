package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrgaoResponsavel {

    private List<Servico> servicos = new ArrayList<Servico>();

    public void executarServico(Servico servico) {
        this.servicos.add(servico);
        servico.executar();
    }

    public void cancelarUltimoServico() {
        if (servicos.size() != 0) {
            Servico servico = this.servicos.get(this.servicos.size() - 1);
            servico.cancelar();
            this.servicos.remove(this.servicos.size() - 1);
        }
    }

}