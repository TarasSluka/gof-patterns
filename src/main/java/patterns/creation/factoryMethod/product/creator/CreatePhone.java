package patterns.creation.factoryMethod.product.creator;

import patterns.creation.factoryMethod.product.product.Phone;
import patterns.creation.factoryMethod.product.product.Product;

public class CreatePhone extends Creator {
    @Override
    public Product factoryMethod(String name) {
        return new Phone(name);
    }
}
