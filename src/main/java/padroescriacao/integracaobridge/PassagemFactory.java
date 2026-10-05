package padroescriacao.integracaobridge;

public class PassagemFactory {

    public static Passagem obterPassagem(String passagem) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padroesintegracao.bridge.Passagem" + passagem);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Passagem inexistente");
        }
        if (!(objeto instanceof Passagem)) {
            throw new IllegalArgumentException("Passagem inválida");
        }
        return (Passagem) objeto;
    }
}