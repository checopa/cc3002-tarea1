package cc3002.tarea1.cards.energy;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;

public abstract class AbstractEnergy implements IEnergy, ICard {
    String name;

    /**
     * Create a new energy
     * @param name Energy's name
     */
    protected AbstractEnergy(String name){
        this.name=name;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract void useEnergyCard(IPokemon pokemon);

}
