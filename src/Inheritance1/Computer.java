package src.Inheritance1;

public abstract class Computer {
    String brand;
    int price;
    int ram;
public Computer(String brand,int price, int ram){
    this.brand = brand;
    this.price = price;
    this.ram = ram;
}
public void showSpecs(){
    System.out.println("Brand: "+ brand);
    System.out.println("Price: " + price);
    System.out.println("Ram; "+ ram);
}
public void computerCanPlay(){
    System.out.println("this computer can play Red Dead Redemtion 2");
}

}
