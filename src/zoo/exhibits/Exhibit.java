package zoo.exhibits;

import zoo.interfaces.*;
import zoo.entities.*;

import java.util.ArrayList;

public abstract class Exhibit {
    private final String name;
    private final int capacity;
    protected ArrayList<Entity> entities;
    protected static int totalExhibits;

    public Exhibit(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.entities = new ArrayList<>();
        totalExhibits++;
    }

    public Exhibit() {
        this("Unnamed Exhibit", 10);
    }

    public static int getTotalExhibits() {
        return totalExhibits;
    }

    public abstract void displayDetails();

    public void addEntity(Entity entity) {
        if (entities.size() < capacity) {
            entities.add(entity);
        } else {
            System.out.println("Exhibit is at full capacity!");
        }
    }
}
