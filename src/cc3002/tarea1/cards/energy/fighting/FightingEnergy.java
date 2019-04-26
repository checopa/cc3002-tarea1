package cc3002.tarea1.cards.energy.fighting;

import cc3002.tarea1.cards.energy.AbstractEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;
/**
 * @author José Pacheco
 */
public class FightingEnergy extends AbstractEnergy {

    public FightingEnergy(String name) {
        super(name);
    }

    @Override
    public void useEnergyCard(IPokemon pokemon) {
        pokemon.receiveFightingEnergy();
    }
}
