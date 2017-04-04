package patterns.creation.factoryMethod.product.creator;

import patterns.creation.factoryMethod.product.product.Pizza;
import patterns.creation.factoryMethod.product.product.Product;

public class CreatePizza extends Creator {
    @Override
    public Product factoryMethod(String name) {
        return new Pizza(name);
    }
}

