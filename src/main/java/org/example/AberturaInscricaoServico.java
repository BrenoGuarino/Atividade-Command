package org.example;

public class AberturaInscricaoServico implements Servico {

    private Inscricao inscricao;

    public AberturaInscricaoServico(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public void executar() {
        this.inscricao.abrirInscricao();
    }

    public void cancelar() {
        this.inscricao.fecharInscricao();
    }
}