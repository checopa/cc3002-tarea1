package cc3002.tarea1.cartas.energy.lighting;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class LightingEnergy extends AbstractEnergy {

    public LightingEnergy() {
    }

    public void useEnergyCard(IPokemon pokemon){
        pokemon.receiveLightingEnergy();
    }
}
