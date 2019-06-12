package cc3002.tarea1.cards.pokemon;

import cc3002.tarea1.visitor.Visitor;

public interface IPhaseOnePokemon extends IPokemon{
    /**
     * getter for the pre-evolution's id.
     * @return pre-evolution's id
     */
    int getPreEvolutionID();

    void accept(Visitor v);
}
