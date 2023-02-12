package src.interface2;

public class Car implements Vehicle{
    int gear;
    int speed;

    public Car(int gear, int speed){
        this.gear = 1;
        this.speed = 0;
    }
    @Override
    public int changeGear(int gear) {
        return gear;


    }

    @Override
    public int speedUp(int speed) {
        return speed;

    }

    @Override
    public int applyBrakes(int speed) {
        return speed;

    }
}
