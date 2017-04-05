package patterns.structure.adapter;

import patterns.structure.adapter.plumber.Chief;
import patterns.structure.adapter.plumber.composition.ChiefAdapter;

public class RunCompositionPlumber {
    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();
        System.out.println(chief.makeDinner());
    }
}
