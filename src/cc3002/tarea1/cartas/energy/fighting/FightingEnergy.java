package cc3002.tarea1.cartas.energy.fighting;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class FightingEnergy extends AbstractEnergy {

    public FightingEnergy() {
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveFightingEnergy();
    }
}
