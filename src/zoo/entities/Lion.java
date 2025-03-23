package zoo.entities;

import zoo.interfaces.Carnivore;
import zoo.interfaces.WildAnimal;

public class Lion extends Animal implements Carnivore, WildAnimal {
    private int age;
    protected boolean isAlpha;

    final public String gender;

    public Lion(String name, int age, String gender) {
        super(name);
        this.age = age;
        this.isAlpha = false;
        this.gender = gender;
    }

    public Lion() {
        this("Unnamed Lion", 0, "unknown");
    }

    @Override
    public void interact() {
        System.out.println("The lion roars loudly!");
    }

    @Override
    public void hunt() {
        System.out.println("The lion is hunting.");
    }

    @Override
    public void roam() {
        System.out.println("The lion roams its territory.");
    }

    public void run() {
        System.out.println("The lion runs!");
    }

    public void run(int speed) {
        System.out.println("The lion runs at a speed of" + speed + "mph!");
    }
    
    protected void setAlpha(boolean isAlpha) {
        this.isAlpha = isAlpha;
    }
}
