//Para ler e escrever dados em java e padronizado da seguinte forma:
//- New Scanner(System.in): cria um leitor de entradas, com metodos uteis com prefixo "next";
//- System.out.println:.Imprime um texto de saida (Output) pulando linha.


import java.util.Scanner;
public class desafio {
    public static void main(String[] args) {
    //Le os valores de entrada:
    Scanner leitorDeEntrada = new Scanner(System.in);
    System.out.println("Eliete, por gentileza, digite o valor salário:");
    float valorSalario = leitorDeEntrada.nextInt();
    System.out.println("agora, por favorzinho, digite o valor beneficio");
    float valorBeneficios = leitorDeEntrada.nextInt();
    float valorImposto = 0;
    if(valorSalario >= 0 && valorSalario <= 1100){
   //Atribui a aliquota de 5% mediante o salario:
       valorImposto = 0.05F * valorSalario;
    }
    else if(valorSalario >= 1100.01 && valorSalario <= 2500.00){
       //Atribui a aliquota de 10% mediante o salario:
           valorImposto = 0.10F * valorSalario;
        }
        else{
           //Atribui a aliquota de 15% mediante o salario:
               valorImposto = 0.15f * valorSalario;
            }
   //Calcula e imprime a saida (com duas casas decimais):
    float saida = valorSalario - valorImposto + valorBeneficios;
       System.out.println(String.format("%.2f", saida));
   }
}

    
    