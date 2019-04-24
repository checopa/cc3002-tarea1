package cc3002.tarea1.cards.energy.lighting;

import cc3002.tarea1.cards.energy.AbstractEnergy;
import cc3002.tarea1.cards.pokemon.IPokemon;

public class LightingEnergy extends AbstractEnergy {

    public LightingEnergy(String name) {
        super(name);
    }


    public void useEnergyCard(IPokemon pokemon){
        pokemon.receiveLightingEnergy();
    }
}
