package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseTwoGrassPokemon extends AbstractGrassPokemon implements IPhaseTwoPokemon {
    public PhaseTwoGrassPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
