import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class processoSeletivo {
    
    
    public static void main(String[] args)  {
        String [] candidatos = {"Felipe", "Marcia","Julia"," Fernanda", "Renato"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);

        }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
        

            

            do{
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("Contato realizado com sucesso");
                
            }while(continuarTentando && tentativasRealizadas < 3);

            if(atendeu)
                System.out.println("Conseguimos contato com " + candidato + "na" + tentativasRealizadas + "tentativa");
            else
            System.out.println("Nao conseguimos contato com" + candidato + ",numero maximo de tentativas" + tentativasRealizadas + " realizada");

        }

            static boolean atender(){
                return new Random().nextInt(3)==1;
            }
           
        selecaoCandidatos();
        imprimirSelecionados();
      
    }


    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia","Julia"," Fernanda", "Renato"};
        System.out.println("Imprimindo lista de candidatos informando indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de nº " + (indice + 1
            ) + " é " + candidatos[indice]);
        }

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia","Julia"," Fernanda", "Renato","Mirela", "Daniela","Jorge", "Monica", "Maria"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 4000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + " solicitou este valor de salario" + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato" + candidato + "foi selecionado para vaga");
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 4200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 4000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if (salarioBase == salarioPretendido) 
        System.out.println("Ligar para candidato com contra proposta");
        else{
            System.out.println("Aguardando os demais candidatos");
        }
            
        }
    }

