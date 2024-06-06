
import java.util.Scanner;

public class Contador {
public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.println("Digite o primeiro parametro");
    int parametroUm = terminal.nextInt();
    System.out.println("Digite o segundo parametro");
    int parametroDois = terminal.nextInt();

    try{
        terminal.close();
        
        contar(parametroUm, parametroDois);
    }catch (parametrosInvalidosException exception){
        System.out.println(" O segundo parametro deve ser maior que o primeiro");
    }

}
static void contar(int parametroUm, int parametroDois) throws parametrosInvalidosException{
    if (parametroUm > parametroDois) {
        throw new parametrosInvalidosException();
    }

    int contagem = parametroDois - parametroUm;
    for(int i =1; i <= contagem; i++){
        System.out.println("Imprimindo o numero " + i );
    }
}
}