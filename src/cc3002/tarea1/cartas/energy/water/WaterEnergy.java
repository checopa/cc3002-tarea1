package cc3002.tarea1.cartas.energy.water;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class WaterEnergy extends AbstractEnergy {

    public WaterEnergy() {
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveWaterEnergy();
    }
}
