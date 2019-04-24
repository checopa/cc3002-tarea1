package cc3002.tarea1.cards.energy.fire;

import cc3002.tarea1.cards.energy.AbstractEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;

public class FireEnergy extends AbstractEnergy {
    public FireEnergy(String name) {
        super(name);
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveFireEnergy();
    }
}
