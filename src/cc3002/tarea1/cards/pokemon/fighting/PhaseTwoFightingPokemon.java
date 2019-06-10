package cc3002.tarea1.cards.pokemon.fighting;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseTwoFightingPokemon extends AbstractFightingPokemon implements IPhaseTwoPokemon {
    public PhaseTwoFightingPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
