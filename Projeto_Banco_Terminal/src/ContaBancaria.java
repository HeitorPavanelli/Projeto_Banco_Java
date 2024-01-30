import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String Nome_Cliente = scanner.next();

        System.out.println("Por favor, digite o nome da Agência!");
        String Agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta!");
        int Numero = scanner.nextInt();

        System.out.println("Digite seu saldo para sacar");
        double saldo = scanner.nextDouble();

        String textoFinal = "Olá " + Nome_Cliente + ", obrigado por criar uma conta em nosso banco, sua agência " + Agencia + ", conta " + Numero + " e seu saldo de " + saldo + " já está disponivel para saque.";

        System.out.println(textoFinal);
    }
}
