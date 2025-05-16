public class Usuario {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada ? " + smartTV.ligada);
        System.out.println(" Canal Atual ? " + smartTV.canal);
        System.out.println("Volume Atual  ? " + smartTV.volume);
    
    smartTV.ligar();
    System.out.println("Novo Status -> Tv Ligada? " + smartTV.ligada);
   
    smartTV.desligar();
    System.out.println("Novo Status -> Tv Ligada? " + smartTV.ligada);

     smartTV.aumentarVolume();
      System.out.println("Volume Atual  ? " + smartTV.volume);

    smartTV.diminuirVolume();
    smartTV.diminuirVolume();
    smartTV.diminuirVolume();
    smartTV.diminuirVolume();

    System.out.println("volume Atual " + smartTV.volume );

    smartTV.aumentarCanal();
    smartTV.aumentarCanal();
    smartTV.aumentarCanal();

    System.out.println("Canal atual "+ smartTV.canal);

    smartTV.mudarCanal(22);

    System.out.println("Canal Atual  " + smartTV.canal);


  }
}
