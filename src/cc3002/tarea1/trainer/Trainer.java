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
    private IPokemon selectedPokemon;
    private ICard selectedCard;
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

    /**
     * A trainer attacks to another trainer
     * @param trainer trainer that receive the attack
     */
    public void attackTrainer(Trainer trainer){
        this.getActivePokemon().attack(trainer.getActivePokemon());
        if(!trainer.getActivePokemon().isAlive()){
            trainer.changeActivePokemon();
        }
    }

    private ICard draw(){
        ICard card=deck.get(0);
        card.setTrainer(this);
        deck.remove(0);
        return card;
    }

    /**
     * Add card to discard stack
     * @param card card that is add to discard stack.
     */
    public void discardCard(ICard card){
        discard.add(card);
    }

    /**
     * Add six cards to list of prize.
     */
    public void addToPrize(){
        if(prizecard.size()<6){
            for(int i=0;i<6;i++){
                this.prizecard.add(draw());
            }
        }
    }

    /**
     * Select pokemon that receive energies, a evolution or a object
     * @param pokemon pokemon that receive energy, a evolution or a object
     */
    public void setSelectedPokemon(IPokemon pokemon){
        this.selectedPokemon=pokemon;
    }

    /**
     * get the selected pokemon
     * @return seleted pokemon
     */
    public IPokemon getSelectedPokemon(){
        return this.selectedPokemon;
    }

    /**
     * Deselected a pokemon
     */
    public void deselectedPokemon(){
        this.selectedPokemon=null;
    }

    /**
     * Select card that is used
     * @param card card that is used
     */
    public void setSelectedCard(ICard card){
        this.selectedCard=card;
    }

    /**
     * get the selected card
     * @return get the selected card
     */
    public ICard getSelectedCard(){
        return this.selectedCard;
    }

    /**
     * Deselected a card
     */
    public void deselectedCard(){
        this.selectedCard=null;
    }

    /**
     * Play a card
     * @param card Card that is played
     */
    public void play(ICard card){
        if(this.hand!=null) {
            hand.remove(card);
            card.playACard(this);
        }
    }

    /**
     * Add card to the hand.
     */
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
     * setter for the active pokemon
     * @param pokemon pokemon that will be the active
     */
    public void setActivePokemon(IPokemon pokemon){
        this.activePokemon=pokemon;
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
