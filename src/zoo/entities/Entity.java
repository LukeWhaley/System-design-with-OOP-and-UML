package zoo.entities;

public abstract class Entity {
    protected final String name;
    
    public Entity(String name) {
        this.name = name;
    }

    public Entity() {
        this("Unnamed Entity");
    }

    public abstract void interact();
}
