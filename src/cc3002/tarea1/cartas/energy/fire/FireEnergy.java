package cc3002.tarea1.cartas.energy.fire;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class FireEnergy extends AbstractEnergy {
    public FireEnergy() {
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveFireEnergy();
    }
}
