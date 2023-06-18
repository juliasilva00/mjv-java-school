package Model;

public class DadosProfissionais {

    private String empresa;

    private String profissao;
    private boolean empregoAtual;
    private Double salario;


    public DadosProfissionais() {
    }


    public DadosProfissionais(String empresa, String profissao, boolean empregoAtual, Double salario) {
        this.empresa = empresa;
        this.profissao = profissao;
        this.empregoAtual = empregoAtual;
        this.salario = salario;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public boolean isEmpregoAtual() {
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual) {
        this.empregoAtual = empregoAtual;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
