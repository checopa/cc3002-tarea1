package cc3002.tarea1.cards.pokemon.lighting;

import cc3002.tarea1.cards.pokemon.IBasicPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

public class BasicLightingPokemon extends AbstractLightingPokemon implements IBasicPokemon {
    public BasicLightingPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }
}
