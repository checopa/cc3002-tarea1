package cc3002.tarea1.habilities;

import java.util.HashMap;

public abstract class AbstractAbility implements IAbility{
    private String name;
    private String description;
    private HashMap<String,Integer> cost;
    private int baseDamage;

    /**
     * Create a new ability.
     * @param name ability's name
     * @param description description of the ability
     * @param cost cost in energy of the ability
     */
    public AbstractAbility(String name, String description, HashMap<String,Integer> cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    


    public String getName() {
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }


    public HashMap<String,Integer> getCost(){
        return this.cost;
    }


    public int getWaterCost(){
        return cost.get("Water");
    }


    public int getFireCost(){
        return cost.get("Fire");
    }


    public int getLightingCost(){
        return cost.get("Lighting");
    }


    public int getFightingCost(){
        return cost.get("Fighting");
    }


    public int getGrassCost(){
        return cost.get("Grass");
    }


    public int getPsychicCost(){
        return cost.get("Psychic");
    }

    public int getBaseDamage(){
        return this.baseDamage;
    }

}
