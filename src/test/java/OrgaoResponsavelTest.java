import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrgaoResponsavelTest {

    OrgaoResponsavel orgaoResponsavel;
    Inscricao inscricao;

    @BeforeEach
    void setUp() {
        orgaoResponsavel = new OrgaoResponsavel();
        inscricao = new Inscricao (2021, 1);
    }

    @Test
    void deveAbrirSemestre() {
        Servico aberturaInscricao = new AberturaInscricaoServico(inscricao);
        orgaoResponsavel.executarServico(aberturaInscricao);

        assertEquals("Inscrições abertas", inscricao.getSituacao());
    }

    @Test
    void deveFecharSemestre() {
        Servico fechamentoInscricao = new FechamentoInscricaoServico(inscricao);
        orgaoResponsavel.executarServico(fechamentoInscricao);

        assertEquals("Inscrições fechadas", inscricao.getSituacao());
    }

    @Test
    void deveCancelarFechamentoSemestre() {
        Servico aberturaInscricao = new AberturaInscricaoServico(inscricao);
        Servico fechamentoInscricao = new FechamentoInscricaoServico(inscricao);

        orgaoResponsavel.executarServico(aberturaInscricao);
        orgaoResponsavel.executarServico(fechamentoInscricao);

        orgaoResponsavel.cancelarUltimoServico();

        assertEquals("Inscrições abertas", inscricao.getSituacao());
    }

}