package padroescriacao.integracaobridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassagemFactoryTest {

    @Test
    void deveRetornarExcecaoParaPassagemInexistente() {
        try {
            Passagem passagem = PassagemFactory.obterPassagem("Turista");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Passagem inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPassagemInvalida() {
        try {
            Passagem passagem = PassagemFactory.obterPassagem("Executiva");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Passagem inválida", e.getMessage());
        }
    }
}
