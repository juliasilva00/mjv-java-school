package Model;

import java.time.LocalDate;
import java.util.Date;

public class Pessoa {

    private Long id;
    private String nome;
    private String CPF;
    private LocalDate dataNascimento;
    private Sexo sexo;
    private Endereco endereco;
    private Contato contato;
    private DadosProfissionais dadosProfissionais;
    private Habilidades habilidades;
    private PretencaoSalarial pretencaoSalarial;


    public Pessoa() {
    }

    public Pessoa(Long id, String nome, String CPF, LocalDate dataNascimento, Sexo sexo, Endereco endereco, Contato contato, DadosProfissionais dadosProfissionais, Habilidades habilidades, PretencaoSalarial pretencaoSalarial) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.endereco = endereco;
        this.contato = contato;
        this.dadosProfissionais = dadosProfissionais;
        this.habilidades = habilidades;
        this.pretencaoSalarial = pretencaoSalarial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public DadosProfissionais getDadosProfissionais() {
        return dadosProfissionais;
    }

    public void setDadosProfissionais(DadosProfissionais dadosProfissionais) {
        this.dadosProfissionais = dadosProfissionais;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public PretencaoSalarial getPretencaoSalarial() {
        return pretencaoSalarial;
    }

    public void setPretencaoSalarial(PretencaoSalarial pretencaoSalarial) {
        this.pretencaoSalarial = pretencaoSalarial;
    }
}
