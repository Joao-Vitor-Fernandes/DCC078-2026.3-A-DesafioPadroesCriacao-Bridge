package padroescriacao.integracaobridge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BilheteriaTest {

    private Bilheteria bilheteria = new Bilheteria();

    @BeforeEach
    void padrao() {
        ConfigTransporte config = ConfigTransporte.getInstance();
        config.setNomeEmpresa("Empresa 1");
        config.setOperadorLogado("Operador 1");
    }

    @Test
    void deveFalharQuandoEmpresaSemNome() {
        ConfigTransporte.getInstance().setNomeEmpresa(null);
        try {
            bilheteria.emitirPassagem("Comum", new FabricaOnibus());
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Empresa não configurada", e.getMessage());
        }
    }

    @Test
    void deveFalharQuandoOperadorNaoLogado() {
        ConfigTransporte.getInstance().setOperadorLogado(null);
        try {
            bilheteria.emitirPassagem("Comum", new FabricaOnibus());
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Empresa não configurada", e.getMessage());
        }
    }

    @Test
    void deveEmitirPassagemComumNoOnibus() {
        assertEquals("Empresa 1 | Valor: R$ 5.0"
            + " | Comprovante de embarque de ônibus",
        bilheteria.emitirPassagem("Comum", new FabricaOnibus()));
    }
}
