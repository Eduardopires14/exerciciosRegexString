package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExemploEmail {
    public static void main(String[] args) {

        String texto = "Meu email é eduardopiresmuller@gmail.com";

        //Cria-se um padrão
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");

        //Aplica o padrão pattern sobre a String texto
        Matcher matcher = pattern.matcher(texto);

        //Procura a primeira ocorrência que corresponde ao padrão
        if (matcher.find()){
            System.out.println(matcher.group()); //retorna a parte do texto que casou com o padrão.
        }


    }
}
