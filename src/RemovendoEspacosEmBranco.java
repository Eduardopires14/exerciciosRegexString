public class RemovendoEspacosEmBranco {
    public static void main(String[] args) {
        String nome = "                João da Silva ";

        System.out.println("Nome com espaço: " + nome);
        System.out.println("Nome sem espaço: " + nome.trim());
    }
}
