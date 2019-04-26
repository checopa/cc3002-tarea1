package cc3002.tarea1.trainer;

import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Pacheco
 */

public class Trainer {
    private String name;
    private List<IPokemon> pokemons;
    private List<IEnergy> energies;
    private IPokemon activePokemon;
    private List<IPokemon> banch=new ArrayList<>();

    /**
     *Create a new Trainer
     * @param name Trainer's name
     * @param pokemons List of trainer's pookemons
     * @param energies List of trainer's energies
     */
    public Trainer(String name, ArrayList<IPokemon> pokemons,ArrayList<IEnergy> energies) {
        this.name=name;
        this.pokemons=pokemons;
        this.energies=energies;
    }

    /**
     * Getter for the trainer's name
     * @return trainer's name
     */
    public String getName(){
        return this.name;
    }

    public void attackTrainer(Trainer trainer){
        this.getActivePokemon().attack(trainer.getActivePokemon());
        if(!trainer.getActivePokemon().isAlive()){
            trainer.changeActivePokemon();
        }
    }

    /**
     * Select Select the active pokemon
     * @param index The pokemon's index
     */
    public void selectActivePokemon(int index){
        this.activePokemon = pokemons.get(index);
        pokemons.remove(index);
    }

    /**
     * Getter for the active pokemon's attacks
     * @return active pokemon's attacks
     */
    public List<Attack> getAttacksPokemon(){
        return this.activePokemon.getAttacks();
    }

    /**
     * Select attack for the pokemon
     * @param index attack's index
     */
    public void selectAttackPokemon(int index){
        this.activePokemon.selectAttack((index));
    }

    /**
     *Getter for the attack selected
     * @return Attack selected
     */
    public Attack getSelectedAttackPokemon(){
        return this.activePokemon.getSelectedAttack();
    }

    /**
     * Getter for the trainer's pokemons
     * @return trainer's pokemons
     */
    public List<IPokemon> getPokemons(){
        return this.pokemons;
    }

    /**
     * Getter for the trainer's energies
     * @return Trainer's energies
     */
    public List<IEnergy> getEnergies(){
        return this.energies;
    }

    /**
     * Pokemon rceive energy
     * @param index energy's index
     */
    public void implementEnergy(int index){
        energies.get(index).useEnergyCard(this.activePokemon);
        energies.remove(index);
    }

    /**
     * getter for the active pokemon
     * @return active pokeon
     */
    public IPokemon getActivePokemon(){
        return this.activePokemon;
    }

    /**
     * add pokemon to the banch
     * @param index pokemon's index to add to banch
     */
    public void addToBanch(int index){
        if (banch.size()<=5){
            banch.add(pokemons.get(index));
            pokemons.remove(index);
        }
    }

    /**
     * Getter for the trainer's banch
     * @return Trainer's banch
     */
    public List<IPokemon> getBanch(){
        return this.banch;
    }

    /**
     * Change active pokemon when the active pokemon die
     */
    public void changeActivePokemon(){
        activePokemon=banch.get(0);
        banch.remove(0);
    }

}
