import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero;
    
        int soma = 0;
        int contador = 0;
        int maior = 0;
        

        do {
            System.out.println("Digite um Numero:  ");
            numero =  scan.nextInt();

            soma = soma + numero;
            
             
            if (numero > maior) maior = numero;

            contador++;
            

        } while (contador < 5);{
            System.out.println("A Soma dos números informados foi: "+ soma);
            System.out.println(" O maior número informado foi : "+ maior);
            System.out.println("A Media dos números informados foi: "+ (soma / 5));

        }

       
    }
  
}
