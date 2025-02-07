package DioProjetoBanco;

import java.util.Scanner;

public class ContaTerminal {

    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public void criarConta() {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        this.nomeCliente = leitor.nextLine();
        System.out.print("Digite a sua agência: ");
        this.agencia = leitor.next();
        System.out.print("Digite o número da conta: ");
        this.numeroConta = leitor.nextInt();
        System.out.print("Digite o saldo inicial da sua conta: ");
        this.saldo = leitor.nextDouble();

        System.out.println("Olá " + this.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + this.agencia + ", conta " + this.numeroConta + " e seu saldo R$" + this.saldo + " já está disponível.");
    }

    public void mostrarConta() {
        System.out.println(" ");
        System.out.println("Dono(a): " + this.nomeCliente);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número Conta: " + this.numeroConta);
        System.out.println("Saldo: " + this.saldo);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
