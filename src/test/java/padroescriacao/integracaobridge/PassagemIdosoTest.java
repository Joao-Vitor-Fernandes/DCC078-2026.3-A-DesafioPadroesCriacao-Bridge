package padroescriacao.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassagemIdosoTest {

    @Test
    void deveRetornarValorPassagemIdosoNoOnibus() {
        MeioTransporte meioTransporte = new MeioTransporteOnibus();
        PassagemIdoso passagem = new PassagemIdoso();
        passagem.setMeioTransporte(meioTransporte);
        assertEquals(0.0, passagem.calcularValor(), 0.01);
    }

    @Test
    void deveRetornarValorPassagemIdosoNoMetro() {
        MeioTransporte meioTransporte = new MeioTransporteMetro();
        PassagemIdoso passagem = new PassagemIdoso();
        passagem.setMeioTransporte(meioTransporte);
        assertEquals(0.0, passagem.calcularValor(), 0.01);
    }
}
