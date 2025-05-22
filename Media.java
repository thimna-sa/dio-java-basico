import java.util.Scanner;

public class Media {
      public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

int idade;
        int soma = 0;
        int contador = 0;
        int media;
        
        do{
          System.out.println( "Digite sua idade:  ");
          idade = scan.nextInt();
          
          soma = soma + idade;
          
          contador++;
          
          
        } while (contador <= 2); {
          media = soma / contador;
          System.out.println( " A média das idades é: " + (soma / contador));
          
          if ( media <= 59){
            System.out.println("Jovem");
            
          }else {
            System.out.println("Idosa");
          }
          
          
          
        }

        
        
        
        
        



 //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:
       
    }
}
