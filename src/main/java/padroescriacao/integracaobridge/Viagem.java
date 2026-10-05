package padroescriacao.integracaobridge;

public class Viagem {

    private MeioTransporte meioTransporte;
    private Comprovante comprovante;

    public Viagem(FabricaAbstrata fabrica) {
        this.meioTransporte = fabrica.createMeioTransporte();
        this.comprovante = fabrica.createComprovante();
    }

    public MeioTransporte getMeioTransporte() {
        return this.meioTransporte;
    }

    public String emitirComprovante() {
        return this.comprovante.emitir();
    }
}
