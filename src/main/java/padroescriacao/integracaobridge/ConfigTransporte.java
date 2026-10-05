package padroescriacao.integracaobridge;

public class ConfigTransporte {

    private ConfigTransporte() {};
    private static ConfigTransporte instance = new ConfigTransporte();
    public static ConfigTransporte getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String operadorLogado;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getOperadorLogado() {
        return operadorLogado;
    }

    public void setOperadorLogado(String operadorLogado) {
        this.operadorLogado = operadorLogado;
    }
}
