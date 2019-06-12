package cc3002.tarea1.cards.pokemon.fire;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

public class BasicFirePokemon extends AbstractFirePokemon implements IBasicPokemon {

    public BasicFirePokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void accept(Visitor v) {
        v.visitBasicPokemon(this);
    }
}
