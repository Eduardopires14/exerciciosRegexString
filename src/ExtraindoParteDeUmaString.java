public class ExtraindoParteDeUmaString {
    public static void main(String[] args) {
        String arquivo = "listaDeExercicios.pdf";

        int posFinal = arquivo.lastIndexOf(".");
        System.out.println("Arquivo sem extensão é: " + arquivo.substring(0,posFinal));
    }
}
