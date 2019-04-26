package cc3002.tarea1.cards.energy.grass;

import cc3002.tarea1.cards.energy.AbstractEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;

/**
 * @author José Pacheco
 */

public class GrassEnergy extends AbstractEnergy {

    public GrassEnergy(String name) {
        super(name);
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveGrassEnergy();
    }
}
