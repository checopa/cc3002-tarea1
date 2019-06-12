package cc3002.tarea1.cards.pokemon;



import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.fighting.AbstractFightingPokemon;
import cc3002.tarea1.cards.pokemon.fire.AbstractFirePokemon;
import cc3002.tarea1.cards.pokemon.lighting.AbstractLightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.AbstractGrassPokemon;
import cc3002.tarea1.cards.pokemon.psychic.AbstractPsychicPokemon;
import cc3002.tarea1.cards.pokemon.water.AbstractWaterPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.visitor.Visitor;

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
     * Getter for the pokemon's attacks
     * @return Attacks of the pokemon
     */
    List<Attack> getAttacks();

    /**
     * Getter for the attack selected
     * @return Attack selected
     */
    Attack getSelectedAttack();

    /**
     * Attack another pokemon
     * @param pokemon Target of the attack
     */
    void attack(IPokemon pokemon);

    /**
     * Selects an attack
     * @param index Index of the attack to be selected
     */
    void selectAttack(int index);

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


    void receiveResistantAttack(IPokemon attack);

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
     * Return if the pokemon has enough energy to attack
     * @return trus if the pokemon can attack, false if not
     */
    boolean cantAttack();

    /**
     * Whether the entity is alive or not
     * @return true if the entity is alive, false if not.
     */
    boolean isAlive();



}