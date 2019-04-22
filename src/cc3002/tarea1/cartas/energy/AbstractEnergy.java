package cc3002.tarea1.cartas.energy;

import cc3002.tarea1.cartas.ICard;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public abstract class AbstractEnergy implements IEnergy, ICard {

    protected AbstractEnergy(){

    }
    public abstract void useEnergyCard(IPokemon pokemon);

}
