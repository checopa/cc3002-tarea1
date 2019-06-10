package cc3002.tarea1.cards.pokemon.water;

import cc3002.tarea1.cards.pokemon.IPhaseOnePokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class OnePhaseWaterPokemon extends AbstractWaterPokemon implements IPhaseOnePokemon {
    public OnePhaseWaterPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
