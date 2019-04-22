package cc3002.tarea1.cartas.energy.electric;

import cc3002.tarea1.cartas.energy.AbstractEnergy;
import cc3002.tarea1.cartas.pokemon.IPokemon;

public class ElectricEnergy extends AbstractEnergy {

    public ElectricEnergy() {
    }

    public void useEnergyCard(IPokemon pokemon){
        pokemon.receiveElectricEnergy();
    }
}
