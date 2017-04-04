package patterns.creation.factoryMethod.product.creator;

import patterns.creation.factoryMethod.product.product.Product;

public abstract class Creator {
    public abstract Product factoryMethod(String name);
}
