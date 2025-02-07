package DioProjetoBanco;

public class Banco {
    public static void main(String[] args) {
        ContaTerminal novaConta = new ContaTerminal();
        novaConta.criarConta();
        novaConta.mostrarConta();
    }
}
