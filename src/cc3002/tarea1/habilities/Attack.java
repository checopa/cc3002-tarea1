package cc3002.tarea1.habilities;

import java.util.HashMap;

/**
 * @author José Pacheco
 */

public class Attack{
    private int baseDamage;
    private String name;
    private String description;
    private HashMap<String,Integer> cost;

    /**
     * Create a new Attack.
     * @param name atack's name
     * @param baseDamage base damage of the attack
     * @param description description of the attack
     * @param cost cost in energy of the attack
     */
    public Attack(String name, int baseDamage, String description, HashMap<String,Integer> cost) {
        this.name = name;
        this.baseDamage = baseDamage;
        this.description = description;
        this.cost = cost;
    }

    /**
     * Getter for the base damage of the attack
     * @return base damage
     */
    public int getBaseDamage() {
        return this.baseDamage;
    }

    /**
     * Getter for the name of attack
     * @return attack's name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for the description of the attack
     * @return attack's description
     */
    public String getDescription(){
        return this.description;
    }

    /**
     * Getter for the attack's cost
     * @return attack's cost
     */
    public HashMap<String,Integer> getCost(){
        return this.cost;
    }

    /**
     * Getter for the water's energy's cost
     * @return water's energy's cost
     */
    public int getWaterCost(){
        return cost.get("Water");
    }

    /**
     * Getter for the fire's energy's cost
     * @return fire's energy's cost
     */
    public int getFireCost(){
        return cost.get("Fire");
    }

    /**
     * Getter for the lighting's energy's cost
     * @return lighting's energy's cost
     */
    public int getLightingCost(){
        return cost.get("Lighting");
    }

    /**
     * Getter for the fighting's energy's cost
     * @return water's fighting's cost
     */
    public int getFightingCost(){
        return cost.get("Fighting");
    }

    /**
     * Getter for the grass's energy's cost
     * @return grass's energy's cost
     */
    public int getGrassCost(){
        return cost.get("Grass");
    }

    /**
     * Getter for the psychic's energy's cost
     * @return psychic's energy's cost
     */
    public int getPsychicCost(){
        return cost.get("Psychic");
    }
    /**
     * Checks if this attack is equal to another.
     *
     * @param obj Object to compare this attack.
     * @return <code>true</code> if the objects are equal, <code>false</code> otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Attack && ((Attack) obj).getBaseDamage() == baseDamage
                && ((Attack) obj).getName().equals(name) && ((Attack) obj).getDescription().equals(description) && ((Attack) obj).getCost().equals(cost);
    }
}