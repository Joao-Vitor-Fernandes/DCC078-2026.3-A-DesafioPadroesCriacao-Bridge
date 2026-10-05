package padroescriacao.integracaobridge;

import java.util.Locale;

// Integração: Singleton + Factory Method + Abstract Factory + Bridge
public class Bilheteria {

    public String emitirPassagem(String tipoPassagem, FabricaAbstrata fabrica) {
        ConfigTransporte config = ConfigTransporte.getInstance();

        if (config.getNomeEmpresa() == null || config.getOperadorLogado() == null) {
            throw new IllegalStateException("Empresa não configurada");
        }

        Passagem passagem = PassagemFactory.obterPassagem(tipoPassagem);
        Viagem viagem = new Viagem(fabrica);
        passagem.setMeioTransporte(viagem.getMeioTransporte());

        return config.getNomeEmpresa()
            + " | Valor: R$ " + passagem.calcularValor()
            + " | " + viagem.emitirComprovante();
    }
}
