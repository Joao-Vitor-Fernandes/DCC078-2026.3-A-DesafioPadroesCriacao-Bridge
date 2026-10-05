package padroescriacao.integracaobridge;

public class PassagemComum extends Passagem {

    public double calcularValor() {
        return this.meioTransporte.valorTarifa();
    }
}
