package cc3002.tarea1.controller;


import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.trainer.Trainer;

import java.util.ArrayList;

public class Controller {
    private Trainer trainerplaying;
    private Trainer trainernotplaying;
    private boolean stealdeck;
    private boolean energyplayed;
    private boolean supportplayed;

    public Controller(Trainer firstTrainer,Trainer secondTrainer){
        trainerplaying=firstTrainer;
        trainernotplaying=secondTrainer;
        trainerplaying.setController(this);
        trainernotplaying.setController(this);
        trainerplaying.setOpponent(trainernotplaying);
        stealdeck=false;
        energyplayed=false;
        supportplayed=false;
    }

    /**
     * Add a card to the trainerplaying's hand
     *
     */
    public void addToHand(){
        if(!stealdeck) {
            trainerplaying.addToHand(1);
            stealdeck = true;
        }
    }

    /**
     * Getter fot the trainerplaying's hand
     * @return trainerplaying's hand
     */
    public ArrayList<ICard> getHand(){
        return trainerplaying.getHand();
    }

    /**
     * Getter for the trainerplaying's bench
     * @return trainerplaying's bench
     */
    public ArrayList<IPokemon> getBench(){
        return trainerplaying.getBench();
    }

    /**
     * Getter for the trainerplaying's active pokemon
     * @return trainerplaying's active pokemon
     */
    public IPokemon getActivePokemon(){
        return trainerplaying.getActivePokemon();
    }

    /**
     * Getter for the trainernotplaying's bench
     * @return trainernotplaying's bench
     */
    public ArrayList<IPokemon> getOpponentBench(){
        return trainernotplaying.getBench();
    }

    /**
     * Getter for the trainernotplaying's active pokemon
     * @return trainernotplaying's active pokemon
     */
    public IPokemon getOpponentActivePokemon(){
        return trainernotplaying.getActivePokemon();
    }

    /**
     * Select card that is used
     * @param card card that is used
     */
    public void setSelectedCard(ICard card){
        trainerplaying.setSelectedCard(card);
    }

    /**
     * Getter for the card that is used
     * @return card that is used
     */
    public ICard getSelectedCard(){
        return trainerplaying.getSelectedCard();
    }
    /**
     * Select pokemon that receive energies, a evolution or a object
     * @param Pokemon pokemon that receive energy, a evolution or a object
     */
    public void setSelectedPokemon(IPokemon Pokemon){
        trainerplaying.setSelectedPokemon(Pokemon);
    }

    /**
     * Getter for the pokemon that receive energies, a evolution or a object
     * @return pokemon that receive energy,a evolution or a object
     */
    public IPokemon getSelectedPokemon(){
        return trainerplaying.getSelectedPokemon();
    }

    /**
     * Deselect a card
     */
    public void deselectCard(){
        trainerplaying.deselectedCard();
    }

    /**
     * Deselect a pokemon
     */
    public void deselectPokemon(){
        trainerplaying.deselectedPokemon();
    }

    /**
     * trainerplaying play a card
     */
    public void playCard(){
        trainerplaying.playCard();
    }

    /**
     * trainerplaying do a stadium effect
     */
    public void doStadiumEffect(){
        trainerplaying.doStadiumEffect();
    }

    /**
     * throw a coin
     */
    public void throwCoin(){
        trainerplaying.throwCoin();
    }

    /**
     * Getter for the coin value
     * @return coin value
     */
    public int getCoin(){
        return trainerplaying.getCoin();
    }

    /**
     * Getter for the active pokemon's abilities
     * @return active pokemon's abilities
     */
    public ArrayList<IAbility> getAbilitiesPokemon(){
        return trainerplaying.getAbilitiesPokemon();
    }

    /**
     * Select ability for the pokemon
     * @param i ability's index
     */
    public void selectAbility(int i){
        trainerplaying.selectAbilityPokemon(i);
    }

    /**
     *Getter for the ability selected
     * @return Ability selected
     */
    public IAbility getSelectAbility(){
        return trainerplaying.getSelectedAbilityPokemon();
    }

    /**
     * trainer use tha ability select
     */
    public void useAbility(){
        trainerplaying.useAbility();
    }

    /**
     * Add i cards to list of prize
     * @param i cards that is added to a list of prize
     */
    public void addtoPrize(int i){
        trainerplaying.addToPrize(i);
    }

    /**
     * Now it's turn of trainernotplaying
     */
    public void changeTurn(){
        Trainer aux = trainerplaying;
        trainerplaying = trainernotplaying;
        trainernotplaying = aux;
        this.stealdeck=false;
        this.energyplayed=false;
        this.supportplayed=false;
    }

    /**
     * finish turn of trainerplayin
     */
    public void finishTurn(){
        this.changeTurn();
    }

    public void energyPlay(){
        this.energyplayed=true;
    }

    public void supportPLay(){
        this.supportplayed=true;
    }

    public boolean getEnergyPlayed(){
        return this.energyplayed;
    }

    public boolean getSupportPlayed(){
        return this.supportplayed;
    }

    /**
     * Getter for the trainer that is playing
     * @return trainer that is playing
     */
    public Trainer getTrainerPlaying(){
        return this.trainerplaying;
    }

    /**
     * Getter for the trainer that is not playing
     * @return trainer that is not playing
     */
    public Trainer getTrainerNotPlaying(){
        return this.trainernotplaying;
    }

    public boolean canUseAbility(){
        return this.trainerplaying.canUseAbility();

    }
}
