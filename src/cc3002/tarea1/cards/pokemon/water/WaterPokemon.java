package cc3002.tarea1.cards.pokemon.water;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.FightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.GrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.LightingPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public class WaterPokemon extends AbstractPokemon {

    public WaterPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveWaterAttack(this);
        }
    }

    @Override
    public void receiveGrassAttack(GrassPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveLightingAttack(LightingPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveFightingAttack(FightingPokemon attack){
        this.receiveResistanAttack(attack);
    }
}
