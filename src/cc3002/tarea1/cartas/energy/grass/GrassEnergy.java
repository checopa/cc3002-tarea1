package cc3002.tarea1.cartas.energy.grass;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class GrassEnergy extends AbstractEnergy {

    public GrassEnergy() {
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveGrassEnergy();
    }
}
