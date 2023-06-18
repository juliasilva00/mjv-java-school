package Service;

import Model.Pessoa;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CsvConstructor {

    public  void gerarCsvDelimitado (List<Pessoa> pessoas){

        StringBuilder stringCsv = new StringBuilder();

        try{

          for(Pessoa pessoa: pessoas){
              stringCsv.append(pessoa.getNome() + ";");
              stringCsv.append(pessoa.getCPF() + ";");
              stringCsv.append(pessoa.getSexo() + ";");
              stringCsv.append(pessoa.getDataNascimento() + ";");

              stringCsv.append(pessoa.getEndereco().getLogradouro() + ";");
              stringCsv.append(pessoa.getEndereco().getNumero() + ";");
              stringCsv.append(pessoa.getEndereco().getBairro() + ";");
              stringCsv.append(pessoa.getEndereco().getComplemento() + ";");
              stringCsv.append(pessoa.getEndereco().getCidade() + ";");
              stringCsv.append(pessoa.getEndereco().getEstado() + ";");

              stringCsv.append(pessoa.getDadosProfissionais().getProfissao() + ";");
              stringCsv.append(pessoa.getDadosProfissionais().getSalario() + ";");
              stringCsv.append(pessoa.getDadosProfissionais().getEmpresa() + ";");
              stringCsv.append(pessoa.getDadosProfissionais().isEmpregoAtual() + ";");

              stringCsv.append(pessoa.getHabilidades().getHabilidades() + ";");

              stringCsv.append(pessoa.getPretencaoSalarial().getPretencaoMax() + ";");
              stringCsv.append(pessoa.getPretencaoSalarial().getPretencaoMin() + ";");

              stringCsv.append(pessoa.getContato().getCelular() + ";");
              stringCsv.append(pessoa.getContato().getEmail() + ";");
              stringCsv.append(pessoa.getContato().getCelular() + ";");
              stringCsv.append(pessoa.getContato().isSeWhatsApp() + ";");

              stringCsv.append(System.lineSeparator());
          }

            Path arquivoDestino = Paths.get("pessoas_doc.csv");

            Files.write(arquivoDestino, stringCsv.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }



}
