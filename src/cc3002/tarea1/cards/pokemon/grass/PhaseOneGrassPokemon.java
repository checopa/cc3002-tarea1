package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseOneGrassPokemon extends AbstractGrassPokemon implements IPhaseOnePokemon {
    public PhaseOneGrassPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
