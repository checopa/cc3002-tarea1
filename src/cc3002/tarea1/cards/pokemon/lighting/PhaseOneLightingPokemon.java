package cc3002.tarea1.cards.pokemon.lighting;


import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class PhaseOneLightingPokemon extends AbstractLightingPokemon implements IPhaseOnePokemon {
    public PhaseOneLightingPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
