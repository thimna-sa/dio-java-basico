import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" qual a Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);


        for(int i = 1 ; i <= 10; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));





        }



    }
}
