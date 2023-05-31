import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Manipulacao {

    public static void main(String[] args) {

        String nome = "Estrela";

        // ISO 8601 -> Horário Padrão Mundial

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "Bom dia!";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde!";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite!";
        } else {
            saudacao = "Olá.";
        }

        System.out.printf("Oĺa, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());


    }
}
