package cc3002.tarea1.cards.pokemon.fire;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseTwoFirePokemon extends AbstractFirePokemon implements IPhaseTwoPokemon {
    public PhaseTwoFirePokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
