package patterns.structure.adapter;

import patterns.structure.adapter.plumber.Chief;
import patterns.structure.adapter.plumber.inheritance.ChiefAdapter;

public class RunInheritancePlumber {
    public static void eat(String dish) {
        System.out.println("eat " + dish);
    }

    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();
        String dish = chief.makeBreakfast();
        eat(dish);
        dish = chief.makeLunch();
        eat(dish);
        dish = chief.makeDinner();
        eat(dish);
    }
}
