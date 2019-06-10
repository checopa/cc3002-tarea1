package cc3002.tarea1.cards.pokemon.fire;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseOneFirePokemon extends AbstractFirePokemon implements IPhaseOnePokemon {
    public PhaseOneFirePokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
