package src.Interface1;

public class Sandwich implements Fastfood {

    @Override
    public void makeOneMore() {
        System.out.println("A sandwich coming up!");
    }

    @Override
    public void whatFilling() {
        System.out.println("Chicken and curry dressing");

    }

    @Override
    public void eat() {
        System.out.println("It tastes delicious");

    }
}
