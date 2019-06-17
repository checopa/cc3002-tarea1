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
    private boolean turnfinish;

    public Controller(Trainer firstTrainer,Trainer secondTrainer){
        trainerplaying=firstTrainer;
        trainernotplaying=secondTrainer;
        trainerplaying.setController(this);
        trainernotplaying.setController(this);
        trainerplaying.setOpponent(trainernotplaying);
        stealdeck=false;
        turnfinish=false;
    }

    /**
     * Add a card to the trainerplaying's hand
     */
    public void addToHand(){
        if(!turnfinish || !stealdeck) {
            trainerplaying.addToHand(1);
            stealdeck = true;
        }
    }

    /**
     * Getter fot the trainerplaying's hand
     * @return trainerplaying's hand
     */
    public ArrayList<ICard> getHand(){
        if(!turnfinish){
            return trainerplaying.getHand();
        }
        return null;
    }

    /**
     * Getter for the trainerplaying's bench
     * @return trainerplaying's bench
     */
    public ArrayList<IPokemon> getBench(){
        if(!turnfinish){
            return trainerplaying.getBench();
        }
        return null;
    }

    /**
     * Getter for the trainerplaying's active pokemon
     * @return trainerplaying's active pokemon
     */
    public IPokemon getActivePokemon(){
        if(!turnfinish){
            return trainerplaying.getActivePokemon();
        }
        return null;
    }

    /**
     * Getter for the trainernotplaying's bench
     * @return trainernotplaying's bench
     */
    public ArrayList<IPokemon> getOpponentBench(){
        if(!turnfinish){
            return trainernotplaying.getBench();
        }
        return null;
    }

    /**
     * Getter for the trainernotplaying's active pokemon
     * @return trainernotplaying's active pokemon
     */
    public IPokemon getOpponentActivePokemon(){
        if(!turnfinish){
            return trainerplaying.getActivePokemon();
        }
        return null;
    }

    /**
     * Select card that is used
     * @param card card that is used
     */
    public void setSelectedCard(ICard card){
        if(!turnfinish){
            trainerplaying.setSelectedCard(card);
        }
    }

    /**
     * Getter for the card that is used
     * @return card that is used
     */
    public ICard getSelectedCard(){
        if(!turnfinish){
            return trainerplaying.getSelectedCard();
        }
        return null;
    }
    /**
     * Select pokemon that receive energies, a evolution or a object
     * @param Pokemon pokemon that receive energy, a evolution or a object
     */
    public void setSelectedPokemon(IPokemon Pokemon){
        if(!turnfinish){
            trainerplaying.setSelectedPokemon(Pokemon);
        }
    }

    /**
     * Getter for the pokemon that receive energies, a evolution or a object
     * @return pokemon that receive energy,a evolution or a object
     */
    public IPokemon getSelectedPokemon(){
        if(!turnfinish){
            return trainerplaying.getSelectedPokemon();
        }
        return null;
    }

    /**
     * Deselect a card
     */
    public void deselectCard(){
        if(!turnfinish){
            trainerplaying.deselectedCard();
        }
    }

    /**
     * Deselect a pokemon
     */
    public void deselectPokemon(){
        if(!turnfinish){
            trainerplaying.deselectedPokemon();
        }
    }

    /**
     * trainerplaying play a card
     */
    public void playCard(){
        if(!turnfinish){
            trainerplaying.playCard();
        }
    }

    /**
     * trainerplaying do a stadium effect
     */
    public void doStadiumEffect(){
        if(!turnfinish){
            trainerplaying.doStadiumEffect();
        }
    }

    /**
     * throw a coin
     */
    public void throwCoin(){
        if(!turnfinish){
            trainerplaying.throwCoin();
        }
    }

    /**
     * Getter for the coin value
     * @return coin value
     */
    public int getCoin(){
        if(!turnfinish){
            return trainerplaying.getCoin();
        }
        return 0;
    }

    /**
     * Getter for the active pokemon's abilities
     * @return active pokemon's abilities
     */
    public ArrayList<IAbility> getAbilitiesPokemon(){
        if(!turnfinish){
            return trainerplaying.getAbilitiesPokemon();
        }
        return null;
    }

    /**
     * Select ability for the pokemon
     * @param i ability's index
     */
    public void selectAbility(int i){
        if(!turnfinish){
            trainerplaying.selectAbilityPokemon(i);
        }
    }

    /**
     *Getter for the ability selected
     * @return Ability selected
     */
    public IAbility getSelectAbility(){
        if(!turnfinish){
            return trainerplaying.getSelectedAbilityPokemon();
        }
        return null;
    }

    /**
     * trainer use tha ability select
     */
    public void useAbility(){
        if(!turnfinish){
            trainerplaying.useAbility();
        }
    }

    /**
     * Add i cards to list of prize
     * @param i cards that is added to a list of prize
     */
    public void addtoPrize(int i){
        if(!turnfinish){
            trainerplaying.addToPrize(i);
        }
    }

    /**
     * Now it's turn of trainernotplaying
     */
    public void changeTurn(){
        if(!turnfinish){
            Trainer aux=trainerplaying;
            trainernotplaying=aux;
            trainerplaying=trainerplaying;
        }
    }

    /**
     * finish turn of trainerplayin
     */
    public void finishTurn(){
        if(!turnfinish){
            this.turnfinish=true;
        }
    }
}
