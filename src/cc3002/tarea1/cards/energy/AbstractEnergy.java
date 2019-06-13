package cc3002.tarea1.cards.energy;

import cc3002.tarea1.cards.AbstractCard;
import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.trainer.Trainer;
import cc3002.tarea1.visitor.Visitor;

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


    @Override
    public abstract void useEnergyCard(IPokemon pokemon);

    @Override
    public void accept(Visitor v){
        v.visitEnergy(this);
    }
}
