package zoo.entities;

import zoo.interfaces.SwayInWind;

public class Orchid extends Plant implements SwayInWind {
    private String waterRequirement;

    public Orchid(String name, String waterRequirement) {
        super(name);
        this.waterRequirement = waterRequirement;
    }

    public Orchid() {
        this("Unnamed Orchid", "Unknown");
    }

    @Override
    public void interact() {
        System.out.println("The orchid is a bright shade of purple.");
    }

    @Override
    public void sway() {
        System.out.println("The orchid sways gently in the breeze.");
    }

    public void grow(){
        System.out.println("The orchid grew!");        
    }

    public void grow(int amount){
        System.out.println("The orchid grew by" + amount + "cm!");        
    }

    protected void setWaterRequirement(String requirement) {
        this.waterRequirement = requirement;
    }
}
