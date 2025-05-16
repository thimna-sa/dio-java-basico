public class SmartTV {
        //Sistema Smart TV
  boolean  ligada = false;
   int canal = 1;
   int volume = 25;

public void mudarCanal(int novoCanal) {
    canal = novoCanal;

}

 public void aumentarCanal() {
     canal++;
     System.out.println("aumentando canal para: " + canal);

 }

 public void diminuirCanal(){
   canal--;
   System.out.println("diminuindo canal para: " + canal);

 }



  public void aumentarVolume() {
     volume++;
     System.out.println("aumentando volume para: " + volume);
  }

  public void diminuirVolume() {
     volume--;
     System.out.println("Diminuindo volume para: " + volume);
  }


   public void ligar(){
    ligada = true;

   }

   public void desligar (){
       ligada =  false;


   }
}
