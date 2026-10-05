package padroescriacao.integracaobridge;

public class FabricaOnibus implements FabricaAbstrata {

    @Override
    public MeioTransporte createMeioTransporte() {
        return new MeioTransporteOnibus();
    }

    @Override
    public Comprovante createComprovante() {
        return new ComprovanteOnibus();
    }
}
