package padroescriacao.integracaobridge;

public abstract class Passagem {

    protected MeioTransporte meioTransporte;

    public void setMeioTransporte(MeioTransporte meioTransporte) {
        this.meioTransporte = meioTransporte;
    }

    public abstract double calcularValor();
}
