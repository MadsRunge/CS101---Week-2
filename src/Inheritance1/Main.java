package src.Inheritance1;

public class Main {
    public static void main(String[] args) {
        Laptop alienware = new Laptop("Alienware",6000, 8, 8);
        Smartphone iphone14 = new Smartphone("Apple", 9000, 6, 6);
        iphone14.playMusic();
        alienware.batteryLife();

    }
}
