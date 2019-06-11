package cc3002.tarea1.cards.energy;

import cc3002.tarea1.cards.AbstractCard;
import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.trainer.Trainer;

/**
 * @author José Pacheco
 */

public abstract class AbstractEnergy extends AbstractCard implements IEnergy {
    String name;

    /**
     * Abstract class that represents a generic energy.
     * @param name Energy's name
     */
    protected AbstractEnergy(String name){
        super(name);

    }

    public void playACard(Trainer trainer){
        if(trainer.getActivePokemon()!=null){
            this.useEnergyCard(trainer.getActivePokemon());
        }
    }


    @Override
    public abstract void useEnergyCard(IPokemon pokemon);

}
