package cc3002.tarea1.cards.energy.psychic;

import cc3002.tarea1.cards.energy.AbstractEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;

/**
 * @author José Pacheco
 */

public class PsychicEnergy extends AbstractEnergy {

    public PsychicEnergy(String name) {
        super(name);
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receivePsychicEnergy();
    }
}
