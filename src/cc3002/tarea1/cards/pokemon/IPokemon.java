package cc3002.tarea1.cards.pokemon;



import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.fighting.AbstractFightingPokemon;
import cc3002.tarea1.cards.pokemon.fire.AbstractFirePokemon;
import cc3002.tarea1.cards.pokemon.lighting.AbstractLightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.AbstractGrassPokemon;
import cc3002.tarea1.cards.pokemon.psychic.AbstractPsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.AbstractWaterPokemon;
import cc3002.tarea1.cards.trainercard.ObjectTrainer;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public interface IPokemon extends ICard {


    /**
     * Getter for the pokemon's id.
     * @return Id of the pokemon
     */
    int getId();

    /**
     * Getter for the pokemon's hp
     * @return Hp of the pokemon
     */
    int getHP();

    /**
     * Getter for the pokemon's abilities
     * @return Abilities of the pokemon
     */
    ArrayList<IAbility> getAbilities();

    /**
     * Getter for the ability selected
     * @return Ability selected
     */
    IAbility getSelectedAbility();

    /**
     * setter for the pokemon's object trainer card
     * @param objectCardTrainer pokemon's object trainer card
     */
    void setObjectTrainerCard(ObjectTrainer objectCardTrainer);

    /**
     * getter for the pokemon's object trainer card
     * @return pokemon's object trainer card
     */
    ObjectTrainer getObjectTrainerCard();

    /**
     * Attack another pokemon
     * @param pokemon Target of the attack
     */
    void attack(IPokemon pokemon);

    /**
     * Selects an ability
     * @param index Index of the ability to be selected
     */
    void selectAbility(int index);

    /**
     * Receives damage from a water attack.
     *
     * @param attack Received attack.
     */
    void receiveWaterAttack(AbstractWaterPokemon attack);

    /**
     * Receives damage from a grass attack.
     *
     * @param attack Received attack.
     */
    void receiveGrassAttack(AbstractGrassPokemon attack);

    /**
     * Receives damage from a fire attack.
     *
     * @param attack Received attack.
     */
    void receiveFireAttack(AbstractFirePokemon attack);

    /**
     * Receives damage from a Lighting attack.
     *
     * @param attack Received attack.
     */
    void receiveLightingAttack(AbstractLightingPokemon attack);

    /**
     * Receives damage from a fight attack
     * @param attack Received attack.
     */
    void receiveFightingAttack(AbstractFightingPokemon attack);

    /**
     * Receives damage from a psychic attack
     * @param attack Received attack.
     */
    void receivePsychicAttack(AbstractPsychicPokemon attack);


    /**
     * Receive an attack
     *
     * @param attack Received attack
     */
    void receiveAttack(IPokemon attack);

    /**
     * Receives an attack to which this Pokémon is weak.
     *
     * @param attack Received attack.
     */
    void receiveWeaknessAttack(IPokemon attack);

    /**
     * Receives an attack to which this Pokémon is resistant.
     *
     * @param attack Received attack
     */
    void receiveResistantAttack(IPokemon attack) ;

    /**
     * Receive Lighting energy
     */
    void receiveLightingEnergy();

    /**
     * Receive fighting energy
     */
    void receiveFightingEnergy();

    /**
     * REceive fire energy
     */
    void receiveFireEnergy();

    /**
     * Receive grass energy
     */
    void receiveGrassEnergy();

    /**
     * Receive psychic energy
     */
    void receivePsychicEnergy();

    /**
     * REceive water energy
     */
    void receiveWaterEnergy();

    /**
     * returns the amount of Lighting energy
     * @return pokemon's lighting energy
     */
    int getLightingEnergy();

    /**
     * returns the amount of grass energy
     * @return pokemon's grass energy
     */
    int getGrassEnergy();

    /**
     * returns the amount of fighting energy
     * @return pokemon's fighting energy
     */
    int getFightingEnergy();

    /**
     * returns the amount of fire energy
     * @return pokemon's fir energy
     */
    int getFireEnergy();

    /**
     * returns the amount of water energy
     * @return pokemon's water energy
     */
    int getWaterEnergy();

    /**
     * returns the amount of psychic energy
     * @return pokemon's psychic energy
     */
    int getPsychicEnergy();

    /**
     * return the amount of energies
     * @return pokemon's energies
     */
    Map<String, Integer> getEnergies();

    /**
     * set the amount of energies
     */
    void setEnergies(Map<String, Integer> energies);


    /**
     * Whether the entity is alive or not
     * @return true if the entity is alive, false if not.
     */
    boolean isAlive();



}