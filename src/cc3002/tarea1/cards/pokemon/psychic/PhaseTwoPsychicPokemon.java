package cc3002.tarea1.cards.pokemon.psychic;

import cc3002.tarea1.cards.pokemon.IPhaseTwoPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseTwoPsychicPokemon extends AbstractPsychicPokemon implements IPhaseTwoPokemon {
    public PhaseTwoPsychicPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
