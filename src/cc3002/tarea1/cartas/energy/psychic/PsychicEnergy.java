package cc3002.tarea1.cartas.energy.psychic;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class PsychicEnergy extends AbstractEnergy {

    public PsychicEnergy() {
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receivePsychicEnergy();
    }
}
