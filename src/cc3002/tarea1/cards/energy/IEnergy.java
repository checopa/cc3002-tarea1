package cc3002.tarea1.cards.energy;

import cc3002.tarea1.cards.pokemon.IPokemon;

public interface IEnergy {
    /**
     * Getter for the energy's name.
     * @return Name of the energy
     */
    String getName();
    /**
     * Use a energy card.
     * @param pokemon
     */
    void useEnergyCard(IPokemon pokemon);
}
