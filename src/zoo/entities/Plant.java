package zoo.entities;

public abstract class Plant extends Entity {

    public boolean alive = true;

    public Plant(String name) {
        super(name);
    }

    public Plant() {
        super();
    }
}