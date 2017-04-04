package patterns.creation.factoryMethod.product.product;

import lombok.Data;

@Data
public abstract class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}
