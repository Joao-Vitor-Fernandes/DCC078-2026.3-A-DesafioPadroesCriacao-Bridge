package padroescriacao.integracaobridge;

public class FabricaMetro implements FabricaAbstrata {

    @Override
    public MeioTransporte createMeioTransporte() {
        return new MeioTransporteMetro();
    }

    @Override
    public Comprovante createComprovante() {
        return new ComprovanteMetro();
    }
}
