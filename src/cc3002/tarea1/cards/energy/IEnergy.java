package cc3002.tarea1.cards.energy;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;

public interface IEnergy extends ICard {
    /**
     * Use a energy card.
     * @param pokemon pokemon that receive the energy
     */
    void useEnergyCard(IPokemon pokemon);
}
