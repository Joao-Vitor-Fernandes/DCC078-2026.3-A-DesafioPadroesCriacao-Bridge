package padroescriacao.integracaobridge;

public class PassagemEstudante extends Passagem {

    public double calcularValor() {
        return this.meioTransporte.valorTarifa() * 0.5;
    }
}