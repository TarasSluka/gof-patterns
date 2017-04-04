package patterns.creation.abstractFactory;

public class RunAbstractFactory {
    public static void main(String[] args) {
        IToyFactory woodenToysFactory = new WoodenToysFactory();
        Bear woodenBear = woodenToysFactory.getBear();
        Cat woodenCat = woodenToysFactory.getCat();
        System.out.println(woodenCat.getName());
        System.out.println(woodenBear.getName());
        IToyFactory teddyToysFactory = new TeddyToysFactory();
        Bear teddyBear = teddyToysFactory.getBear();
        Cat teddyCat = teddyToysFactory.getCat();
        System.out.println(teddyBear.getName());
        System.out.println(teddyCat.getName());
    }
}
