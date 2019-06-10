package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class BasicGrassPokemon extends AbstractGrassPokemon implements IBasicPokemon {
    public BasicGrassPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
