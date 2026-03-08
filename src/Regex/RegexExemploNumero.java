package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExemploNumero {
    public static void main(String[] args) {

        System.out.println(formatarTelefone("51996126727"));

    }

    public static String formatarTelefone (String telefone){

        String regex = "(\\d{2})(\\d{4,5})(\\d{4})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefone);

        if (matcher.matches()){ //Verifica se a string inteira corresponde ao padrão //Só é tru e toda a string corresponde // O find também funcionaria aqui
            return String.format("(%s) %s-%s", matcher.group(1), matcher.group(2), matcher.group(3));
        }

        return "Numero de telefone inválido!";

    }
}
