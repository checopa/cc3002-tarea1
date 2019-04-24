package cc3002.tarea1.cards.energy.water;

import cc3002.tarea1.cards.energy.AbstractEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;

public class WaterEnergy extends AbstractEnergy {

    public WaterEnergy(String name) {
        super(name);
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveWaterEnergy();
    }
}
