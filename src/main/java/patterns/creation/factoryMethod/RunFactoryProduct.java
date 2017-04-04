package patterns.creation.factoryMethod;

import patterns.creation.factoryMethod.product.creator.CreatePhone;
import patterns.creation.factoryMethod.product.creator.CreatePizza;
import patterns.creation.factoryMethod.product.creator.Creator;
import patterns.creation.factoryMethod.product.product.Product;

public class RunFactoryProduct {
    public static void main(String[] args) {

        Creator[] creators = {new CreatePhone(), new CreatePhone(), new CreatePizza()};
        for (Creator creator :
                creators) {
            Product product = creator.factoryMethod("asd");
            System.out.println("::::::::::::::::::::::::::::");
            System.out.println("" + product.getClass());
            System.out.println("name" + product.getName());
        }
    }
}
