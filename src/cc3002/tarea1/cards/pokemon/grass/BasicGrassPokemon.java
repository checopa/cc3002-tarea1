package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

public class BasicGrassPokemon extends AbstractGrassPokemon implements IBasicPokemon {
    public BasicGrassPokemon(String name, int id, int hp, ArrayList<IAbility> abilitiesList) {
        super(name, id, hp, abilitiesList);
    }

    @Override
    public void accept(Visitor v) {
        v.visitBasicPokemon(this);
    }
}
