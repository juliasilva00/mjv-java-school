import Model.Contato;
import Model.DadosProfissionais;
import Model.Endereco;
import Model.Habilidades;
import Model.Pessoa;
import Model.PretencaoSalarial;
import Model.Sexo;
import Service.CsvConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static Service.FormatarDados.formataCpf;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa(1L,"Maria Aparecida", formataCpf("111.111.111-89"), LocalDate.of(1997, 05,30), Sexo.F,
                    new Endereco("Rua 1", 50, "Torre A AP 10", "Bairro XPT", "Juarerê", "SP"),
                    new Contato("mariapa@mjv.school.br",Long.valueOf("000000") , 56997689058L, false),
                    new DadosProfissionais("ABCD Software House", "QA Jr", true, 4000.00),
                    new Habilidades(List.of("Selenium", "MYSQL", "MONGODB", "TDD", "Unit Tests")),
                    new PretencaoSalarial(4500.00, 5500.00)));

        //se nao optar por usar listOf, instancia a classe habilidade popula e coloca como parametro no objeto pessoa.

        CsvConstructor csvConstructor = new CsvConstructor();

        csvConstructor.gerarCsvDelimitado(pessoas);

    }
}