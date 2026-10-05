package padroescriacao.integracaobridge;

public interface FabricaAbstrata {
    MeioTransporte createMeioTransporte();
    Comprovante createComprovante();
}
