package patterns.creation.abstractFactory;

public class WoodenToysFactory implements IToyFactory {
    public Bear getBear() {
        return new WoodenBear();
    }

    public Cat getCat() {
        return new WoodenCat();
    }
}
