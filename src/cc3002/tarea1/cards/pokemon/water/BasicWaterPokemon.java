package cc3002.tarea1.cards.pokemon.water;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class BasicWaterPokemon extends AbstractWaterPokemon implements IBasicPokemon {
    public BasicWaterPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
