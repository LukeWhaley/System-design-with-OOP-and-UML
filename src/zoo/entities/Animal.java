package zoo.entities;

public abstract class Animal extends Entity {

    public boolean alive = true;

    public Animal(String name) {
        super(name);
    }

    public Animal() {
        super();
    }
}