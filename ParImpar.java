import java.util.Scanner;

public class ParImpar {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int quantNumeros;
    int contador = 0;
    int numero;
    int quantPares = 0;
    int quantImpares = 0;

    System.out.println(" Qual a quantidade de números:");
    quantNumeros = scan.nextInt();

   do {
    System.out.println("Qual o número? ");
    numero = scan.nextInt();

    if (numero % 2 == 0) quantPares++;
    else quantImpares++;
        

    contador++;
   } while ( contador < quantNumeros);
   System.out.println( " Quantidade de números pares:  " + quantPares);
   System.out.println(" Quantidade de números impares:" + quantImpares);
 }
    

}
