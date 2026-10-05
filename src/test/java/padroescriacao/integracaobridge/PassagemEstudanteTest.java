package padroescriacao.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassagemEstudanteTest {

    @Test
    void deveRetornarValorPassagemEstudanteNoOnibus() {
        MeioTransporte meioTransporte = new MeioTransporteOnibus();
        PassagemEstudante passagem = new PassagemEstudante();
        passagem.setMeioTransporte(meioTransporte);
        assertEquals(2.5, passagem.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarValorPassagemEstudanteNoMetro() {
        MeioTransporte meioTransporte = new MeioTransporteMetro();
        PassagemEstudante passagem = new PassagemEstudante();
        passagem.setMeioTransporte(meioTransporte);
        assertEquals(3.5, passagem.calcularValor(), 0.01);
    }
}
