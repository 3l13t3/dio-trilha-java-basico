import java.util.Scanner;
public class VerificarChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            System.out.println("Transaçao realizada com sucesso.!");
        }else if (saque <= saldo + limiteChequeEspecial) {
            System.out.println("Transaçao realizada com sucesso utilizando o cheque especial.");
        }else{
            System.out.println("Transaçao nao realizada.Limite do cheque especial excedido");
        }
        scanner.close();
    }
}