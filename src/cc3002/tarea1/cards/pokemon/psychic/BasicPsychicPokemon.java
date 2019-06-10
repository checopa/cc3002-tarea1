package cc3002.tarea1.cards.pokemon.psychic;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class BasicPsychicPokemon extends AbstractPsychicPokemon implements IBasicPokemon {
    public BasicPsychicPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
