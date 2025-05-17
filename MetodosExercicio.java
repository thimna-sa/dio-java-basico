import java.util.Scanner;

public class MetodosExercicio {

// Calculadoras
public static void main(String[] args) {
    
    int numero1;
    int numero2;
    boolean opcao;

    Scanner scan = new Scanner(System.in);

    System.out.println(" Qual o primeiro número? ");
    numero1 = scan.nextInt();

    System.out.println("Qual é o segundo numero?");
    numero2 = scan.nextInt();

  
    int resultado = numero1 + numero2;

   System.out.print( " o resultado é : " + resultado);

}
}







