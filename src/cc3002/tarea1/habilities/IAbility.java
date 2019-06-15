package cc3002.tarea1.habilities;

import cc3002.tarea1.effects.IEffect;
import cc3002.tarea1.trainer.Trainer;
import cc3002.tarea1.visitor.Visitor;

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
     * getter for the trainer that use the ability
     * @return trainer that use the ability
     */
    Trainer getTrainer();

    /**
     * setter for the trainer that use the ability
     * @param trainer trainer that use the ability
     */
    void setTrainer(Trainer trainer);

    /**
     * Getter for the ability's effect
     * @return
     */
    IEffect getEffect();

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

    void accept(Visitor v);


    /**
     * Getter for the base damage of the attack
     * @return base damage
     */
    int getBaseDamage();

}
