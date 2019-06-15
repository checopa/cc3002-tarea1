package cc3002.tarea1.habilities;

import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.trainer.Trainer;

import java.util.HashMap;
import java.util.Objects;

public abstract class AbstractAbility implements IAbility{
    private String name;
    private String description;
    private HashMap<String,Integer> cost;
    private int baseDamage;
    private IEffect effect;
    private Trainer trainer;

    /**
     * Create a new ability.
     * @param name ability's name
     * @param description description of the ability
     * @param cost cost in energy of the ability
     */
    public AbstractAbility(String name, String description, HashMap<String,Integer> cost, IEffect effect) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.effect=effect;
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


    public void setTrainer(Trainer trainer){
        this.trainer=trainer;
    }

    public Trainer getTrainer(){
        return this.trainer;
    }

    public IEffect getEffect(){
        return this.effect;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractAbility)) return false;
        AbstractAbility that = (AbstractAbility) o;
        return getBaseDamage() == that.getBaseDamage() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getDescription(), that.getDescription()) &&
                Objects.equals(getCost(), that.getCost()) &&
                Objects.equals(effect, that.effect);
    }
}
