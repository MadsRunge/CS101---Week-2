package src.Inheritance1;

public class Laptop extends Computer {
    int batteryTime;

    public Laptop(String brand, int price, int ram, int batteryTime){
        super(brand,price, ram);
        this.batteryTime = batteryTime;
    }

    public void batteryLife(){
        System.out.println("2 hours until recharge");
    }


}
