package cc3002.tarea1.trainer;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.energy.IEnergy;
import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Pacheco
 */

public class Trainer {
    private String name;
    private List<ICard> deck;
    private List<ICard> hand;
    private List<ICard> discard;
    private List<ICard> prizecard;
    private IPokemon activePokemon;
    private List<IPokemon> bench=new ArrayList<>();

    /**
     * Create a new trainer
     * @param name trainer's name
     * @param deck trainer's deck
     */
    public Trainer(String name, ArrayList<ICard> deck) {
        this.name=name;
        this.deck=deck;
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

    private ICard draw(){
        ICard card=deck.get(0);
        deck.remove(0);
        return card;
    }

    public void discardCard(ICard card){
        discard.add(card);
    }

    public void addToPrize(){
        if(prizecard.size()<6){
            for(int i=0;i<6;i++){
                this.prizecard.add(draw());
            }
        }
    }

    public void play(ICard card){
        if(this.hand!=null) {
            hand.remove(card);
            card.playACard(this);
        }
    }

    public void addToHand(){
        this.hand.add(draw());
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
     * Getter for the trainer's hand
     * @return trainer's hand
     */
    public List<ICard> getHand(){
        return this.hand;
    }




    /**
     * getter for the active pokemon
     * @return active pokeon
     */
    public IPokemon getActivePokemon(){
        return this.activePokemon;
    }



    /**
     * Getter for the trainer's bench
     * @return Trainer's bench
     */
    public List<IPokemon> getBench(){
        return this.bench;
    }

    /**
     * Change active pokemon when the active pokemon die
     */
    public void changeActivePokemon(){
        discardCard(activePokemon);
        activePokemon=bench.get(0);
        bench.remove(0);
    }

    public void playPokemon(IPokemon pokemon) {
        if(this.getActivePokemon()==null){
            activePokemon=pokemon;
        }
        else if(bench.size()<5){
            bench.add(pokemon);
        }
    }
}
