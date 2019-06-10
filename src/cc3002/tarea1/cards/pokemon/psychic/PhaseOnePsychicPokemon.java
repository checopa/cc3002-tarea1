package cc3002.tarea1.cards.pokemon.psychic;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseOnePsychicPokemon extends AbstractPsychicPokemon implements IPhaseOnePokemon {
    public PhaseOnePsychicPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
