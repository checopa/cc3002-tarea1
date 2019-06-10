package cc3002.tarea1.cards.pokemon.lighting;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseTwoLightingPokemon extends AbstractLightingPokemon implements IPhaseTwoPokemon {
    public PhaseTwoLightingPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
