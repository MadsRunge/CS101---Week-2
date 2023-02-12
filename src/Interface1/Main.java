package src.Interface1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Applepie applepie = new Applepie();
        Pizza pizza = new Pizza();
        Sandwich sandwich = new Sandwich();

        ArrayList<Fastfood> fastfoods = new ArrayList<>();
        fastfoods.add(applepie);
        fastfoods.add(pizza);
        fastfoods.add(sandwich);

        for (int i = 0; i < fastfoods.size(); i++) {
            fastfoods.get(i).eat();
            fastfoods.get(i).makeOneMore();
            fastfoods.get(i).whatFilling();

        }

    }
}
