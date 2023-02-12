package src.Interface1;

public class Pizza implements Fastfood {


    @Override
    public void makeOneMore() {
        System.out.println("Another Pizza!");
    }

    @Override
    public void whatFilling() {
        System.out.println("Pepperoni and dressing");

    }

    @Override
    public void eat() {
        System.out.println("oh mama, Tasty! ");

    }
}
