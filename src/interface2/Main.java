package src.interface2;

public class Main {
    public static void main(String[] args) {
        Car mercedes = new Car(1,0);
        Car volvo = new Car(0,0);

        System.out.println(mercedes.speedUp(40));
        System.out.println(volvo.changeGear(3));
        System.out.println(mercedes.applyBrakes(20));
    }
}
