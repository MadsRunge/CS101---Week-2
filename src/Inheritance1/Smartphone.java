package src.Inheritance1;

public class Smartphone extends Computer {
    int screenSize;

    public Smartphone(String brand, int prie, int ram, int screenSize){
        super(brand,prie,ram);
        this.screenSize = screenSize;

    }
  public void playMusic(){
      System.out.println("'Get back' by The beatles is playing");
  }


}
