package cc3002.tarea1.cartas.pokemon;
import cc3002.tarea1.cartas.pokemon.electric.ElectricAttack;
import cc3002.tarea1.cartas.pokemon.fighting.FightingAttack;
import cc3002.tarea1.cartas.pokemon.fire.FireAttack;
import cc3002.tarea1.cartas.pokemon.grass.GrassAttack;
import cc3002.tarea1.cartas.pokemon.psychic.PsychicAttack;
import cc3002.tarea1.cartas.pokemon.water.WaterAttack;

import java.util.List;


/**
 *
 */
public interface IPokemon {
    /**
     * Getter for the pokemon's name.
     * @return Name of the pokemon
     */
    String getName();

    /**
     * Getter for the pokemon's hp
     * @return Hp of the pokemon
     */
    int getHP();

    /**
     * Getter for the pokemon's attacks
     * @return Attacks of the pokemon
     */
    List<IAttack> getAttacks();

    /**
     * Getter for the attack selected
     * @return Attack selected
     */
    IAttack getSelectedAttack();

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
    void receiveWaterAttack(WaterAttack attack);

    /**
     * Receives damage from a grass attack.
     *
     * @param attack Received attack.
     */
    void receiveGrassAttack(GrassAttack attack);

    /**
     * Receives damage from a fire attack.
     *
     * @param attack Received attack.
     */
    void receiveFireAttack(FireAttack attack);

    /**
     * Receives damage from a electric attack.
     *
     * @param attack Received attack.
     */
    void receiveElectricAttack(ElectricAttack attack);

    /**
     * Receives damage from a fight attack
     * @param attack Received attack.
     */
    void receiveFightingAttack(FightingAttack attack);

    /**
     * Receives damage from a psychic attack
     * @param attack Received attack.
     */
    void receivePsychicAttack(PsychicAttack attack);

    /**
     * Receive electric energy
     */
    void receiveElectricEnergy();

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


}