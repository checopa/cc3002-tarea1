package cc3002.tarea1.cards.energy;

import cc3002.tarea1.cards.ICard;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.visitor.Visitor;

public interface IEnergy extends ICard {
    /**
     * Use a energy card.
     * @param pokemon pokemon that receive the energy
     */
    void useEnergyCard(IPokemon pokemon);

    void accept(Visitor v);
}
