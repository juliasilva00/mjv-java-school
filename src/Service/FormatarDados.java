package Service;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatarDados {

    public static String formataData(LocalDate data) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dataFormatada = dateFormatter.format(data);

        return dataFormatada;
    }

    public static String formataSalario(Double salario) {
        String formataValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(salario);

        return formataValor;
    }

    public static String formataPretensaoSalarial(BigDecimal salario) {
        String formataValor = NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(salario);

        return formataValor;
    }

    public static String formataCpf(String cpf) {
        return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9);
    }
}
