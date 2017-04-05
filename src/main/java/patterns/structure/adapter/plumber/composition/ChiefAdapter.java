package patterns.structure.adapter.plumber.composition;

import patterns.structure.adapter.plumber.Chief;
import patterns.structure.adapter.plumber.Plumber;

public class ChiefAdapter implements Chief {
    private Plumber plumber = new Plumber();

    @Override
    public String makeBreakfast() {
        return plumber.getGasket();
    }

    @Override
    public String makeLunch() {
        return plumber.getScrewNut();
    }

    @Override
    public String makeDinner() {
        return plumber.getPipe();
    }
}
