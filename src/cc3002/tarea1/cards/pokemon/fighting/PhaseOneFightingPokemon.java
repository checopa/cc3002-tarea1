package cc3002.tarea1.cards.pokemon.fighting;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseOneFightingPokemon extends AbstractFightingPokemon implements IPhaseOnePokemon {
    public PhaseOneFightingPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
