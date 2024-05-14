import java.util.Scanner;
public class contaTerminal {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Por favor, digite o numero da conta");
        int numero = scanner.nextInt();
        System.out.println("Digite a Agencia");
        String agencia = scanner.next();
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        scanner.nextLine();
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();
        System.out.println("\n\n\nOlá " + nome + "! obrigado por criar uma conta em nosso banco \nsua agência é: " + agencia + "\nconta:" + numero + "\nseu saldo de R$" + saldo + " já esta disponivel para saque");

        scanner.close();
    }
    
}
