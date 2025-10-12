package cote.poly;

public class Main {
    public static void main(String[] args) {
        Animal[] myAnimals = new Animal[5];
        myAnimals[0] = new Cat();
        myAnimals[1] = new Dog();
        myAnimals[2] = new Mouse();
        myAnimals[3] = new Cow();
        myAnimals[4] = new Dog();

        for (Animal a:myAnimals) {
            System.out.println(a.hello());
        }
    }
}
