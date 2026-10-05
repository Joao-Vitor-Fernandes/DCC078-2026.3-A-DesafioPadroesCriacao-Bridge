package padroescriacao.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassagemComumTest {

    @Test
    void deveRetornarValorPassagemComumNoOnibus() {
        MeioTransporte meioTransporte = new MeioTransporteOnibus();
        PassagemComum passagem = new PassagemComum();
        passagem.setMeioTransporte(meioTransporte);
        assertEquals(5.0, passagem.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarValorPassagemComumNoMetro() {
        MeioTransporte meioTransporte = new MeioTransporteMetro();
        PassagemComum passagem = new PassagemComum();
        passagem.setMeioTransporte(meioTransporte);
        assertEquals(7.0, passagem.calcularValor(), 0.01);
    }
}
