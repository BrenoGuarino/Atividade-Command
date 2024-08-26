package org.example;

public class Inscricao {

    private int ano;
    private int inscricao;
    private String situacao;

    public Inscricao(int ano, int inscricao) {
        this.ano = ano;
        this.inscricao = inscricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirInscricao() {
        this.situacao = "Inscrições abertas";
    }

    public void fecharInscricao() {
        this.situacao = "Inscrições fechadas";
    }
}