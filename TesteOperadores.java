public class TesteOperadores {

    public static void main(String[] args) {
     String nomeCompleto = "linguagem" + " Java";
     System.out.println(nomeCompleto);
     

     String concatenacao = "?";
     concatenacao = 1+1+1+"1";
      System.out.println(concatenacao);

     concatenacao = 1+ "1"+ 1 + 1;
      System.out.println(concatenacao);

     concatenacao = "1"+ 1 + 1 + 1;

      System.out.println(concatenacao);

     concatenacao = "1" + (1+1+1);

       System.out.println(concatenacao);

    }
    
}
