package cc3002.tarea1.cards.pokemon;

import cc3002.tarea1.visitor.Visitor;

public interface IBasicPokemon extends IPokemon{
    void accept(Visitor v);
}
