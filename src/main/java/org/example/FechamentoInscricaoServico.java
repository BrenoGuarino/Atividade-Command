package org.example;

public class FechamentoInscricaoServico implements Servico {

    private Inscricao inscricao;

    public FechamentoInscricaoServico(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public void executar() {
        this.inscricao.fecharInscricao();
    }

    public void cancelar() {
        this.inscricao.abrirInscricao();
    }
}