package cc3002.tarea1.cards.pokemon;

import cc3002.tarea1.visitor.Visitor;

public interface IPhaseTwoPokemon extends IPokemon{

    /**
     * getter fot the pre-evolution's id
     * @return pre-evolutions's id
     */
    int getPreEvolutionId();

    void accept(Visitor v);
}
