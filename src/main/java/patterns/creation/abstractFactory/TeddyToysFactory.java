package patterns.creation.abstractFactory;

public class TeddyToysFactory implements IToyFactory {
    public Bear getBear() {
        return new TeddyBear();
    }

    public Cat getCat() {
        return new TeddyCat();
    }
}
