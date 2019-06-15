package cc3002.tarea1.trainer;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.trainercard.AbstractTrainerCard;
import cc3002.tarea1.cards.trainercard.StadiumTrainer;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.PlayAbilityVisitor;
import cc3002.tarea1.visitor.PlayCardVisitor;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author José Pacheco
 */

public class Trainer {
    private String name;
    private IPokemon selectedPokemon;
    private ICard selectedCard;
    private ArrayList<ICard> deck;
    private ArrayList<ICard> hand=new ArrayList<>();
    private ArrayList<ICard> discard=new ArrayList<>();
    private ArrayList<ICard> prizecard;
    private IPokemon activePokemon;
    private ArrayList<IPokemon> bench=new ArrayList<>();
    private Visitor visitplaycard;
    private Visitor visitAbility;
    private AbstractTrainerCard stadiumTrainer;
    private Trainer opponent;

    /**
     * Create a new trainer
     * @param name trainer's name
     * @param deck trainer's deck
     */
    public Trainer(String name, ArrayList<ICard> deck) {
        this.name=name;
        this.deck=deck;
        visitplaycard=new PlayCardVisitor();
        visitAbility=new PlayAbilityVisitor();
        if(60<this.deck.size()){
            for(int i=0;i<(this.deck.size()-4);i++){
                this.deck.remove(60);
            }

        }
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

    public void setOpponent(Trainer trainer){
        this.opponent=trainer;
    }

    public Trainer getOpponent(){
        return this.opponent;
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
     * Add n cards to the hand.
     */
    public void addToHand(int n){
        while(n>0) {
            this.hand.add(draw());
            n--;
        }
    }

    public void playCard(){
        this.selectedCard.accept(this.visitplaycard);
    }


    public void useAbility(){
        this.getSelectedAbilityPokemon().accept(this.visitAbility);
    }

    public void setStadiumCard(StadiumTrainer stadiumTrainer){
        this.stadiumTrainer=stadiumTrainer;
    }

    public void doStadiumEffect(){
        stadiumTrainer.getEffect().doEffect(this);
    }


    /**
     * Getter for the active pokemon's attacks
     * @return active pokemon's attacks
     */
    public List<IAbility> getAbilitiesPokemon(){
        return this.activePokemon.getAbilities();
    }

    /**
     * Select attack for the pokemon
     * @param index attack's index
     */
    public void selectAbilityPokemon(int index){

        this.activePokemon.selectAbility((index));
        this.activePokemon.getSelectedAbility().setTrainer(this);
    }

    /**
     *Getter for the attack selected
     * @return Attack selected
     */
    public IAbility getSelectedAbilityPokemon(){
        return this.activePokemon.getSelectedAbility();
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
     * Getter for the trainer's discard cards
     * @return trainer's discard cards
     */

    public ArrayList<ICard> getDiscardCards(){
        return this.discard;
    }

    public void addToBench(IPokemon pokemon){
        this.bench.add(pokemon);
    }

    /**
     * Change active pokemon when the active pokemon die
     */
    public void changeActivePokemon(){
        discardCard(activePokemon);
        activePokemon=bench.get(0);
        bench.remove(0);
    }



}
