package cc3002.tarea1.habilities;

import java.util.HashMap;

public interface IAbility {
    /**
     * Getter for the name of ability
     * @return ability's ability
     */
    String getName();

    /**
     * Getter for the description of the ability
     * @return ability's description
     */
    String getDescription();

    /**
     * Getter for the ability's cost
     * @return ability's cost
     */
    HashMap<String,Integer> getCost();

    /**
     * Getter for the water's energy's cost
     * @return water's energy's cost
     */
    int getWaterCost();

    /**
     * Getter for the fire's energy's cost
     * @return fire's energy's cost
     */
    int getFireCost();

    /**
     * Getter for the lighting's energy's cost
     * @return lighting's energy's cost
     */
    int getLightingCost();

    /**
     * Getter for the fighting's energy's cost
     * @return water's fighting's cost
     */
    int getFightingCost();

    /**
     * Getter for the grass's energy's cost
     * @return grass's energy's cost
     */
    int getGrassCost();

    /**
     * Getter for the psychic's energy's cost
     * @return psychic's energy's cost
     */
    int getPsychicCost();

}
