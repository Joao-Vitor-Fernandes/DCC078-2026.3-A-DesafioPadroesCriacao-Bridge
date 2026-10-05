package padroescriacao.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViagemTest {

    @Test
    void deveRetornarMeioTransporteOnibusNaFabricaOnibus() {
        FabricaAbstrata fabrica = new FabricaOnibus();
        Viagem viagem = new Viagem(fabrica);
        assertEquals(5.0, viagem.getMeioTransporte().valorTarifa(), 0.01);
    }

    @Test
    void deveRetornarMeioTransporteMetroNaFabricaMetro() {
        FabricaAbstrata fabrica = new FabricaMetro();
        Viagem viagem = new Viagem(fabrica);
        assertEquals(7.0, viagem.getMeioTransporte().valorTarifa(), 0.01);
    }

    @Test
    void deveEmitirComprovanteOnibus() {
        FabricaAbstrata fabrica = new FabricaOnibus();
        Viagem viagem = new Viagem(fabrica);
        assertEquals("Comprovante de embarque de ônibus", viagem.emitirComprovante());
    }

    @Test
    void deveEmitirComprovanteMetro() {
        FabricaAbstrata fabrica = new FabricaMetro();
        Viagem viagem = new Viagem(fabrica);
        assertEquals("Comprovante de embarque de metrô", viagem.emitirComprovante());
    }
}
