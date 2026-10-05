package padroescriacao.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfigTransporteTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        ConfigTransporte.getInstance().setNomeEmpresa("Empresa 1");
        assertEquals("Empresa 1", ConfigTransporte.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarOperadorLogado() {
        ConfigTransporte.getInstance().setOperadorLogado("Operador 1");
        assertEquals("Operador 1", ConfigTransporte.getInstance().getOperadorLogado());
    }
}

