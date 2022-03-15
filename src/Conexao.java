public class Conexao {

    private static Conexao conection;

    private Conexao() {
    }

    public static Conexao getInstance() {
        return conection == null ? new Conexao() : conection;
    }

    public static void connetion() throws Exception {
        System.out.println("Conexão!");
    }
}