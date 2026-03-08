import java.util.Scanner;
import java.util.regex.Pattern;

public class FormatandoNumeros {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        double valor = leitura.nextDouble();

        String valoFormatado = String.format("R$ %.2f", valor);

        System.out.println("Valor formatado: " + valoFormatado);
    }
}
