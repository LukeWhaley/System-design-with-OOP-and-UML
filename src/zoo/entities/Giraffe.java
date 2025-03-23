package zoo.entities;

import zoo.interfaces.WildAnimal;

public class Giraffe extends Animal implements WildAnimal {
    private int age;
    final public String gender;

    public Giraffe(String name, int age, String gender) {
        super(name);
        this.age = age;
        this.gender = gender;
    }

    public Giraffe() {
        this("Unnamed Giraffe", 0, "unknown");
    }

    @Override
    public void interact() {
        System.out.println("The giraffe lowers its long neck!");
    }

    @Override
    public void roam() {
        System.out.println("The giraffe roams.");
    }

    public void run() {
        System.out.println("The giraffe runs!");
    }

    public void run(int speed) {
        System.out.println("The giraffe runs at a speed of" + speed + "mph!");
    }

}
