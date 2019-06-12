package cc3002.tarea1.cards.pokemon.water;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.AbstractFightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.AbstractGrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.AbstractLightingPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public class AbstractWaterPokemon extends AbstractPokemon {

    public AbstractWaterPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveWaterAttack(this);
        }
    }

    @Override
    public void receiveGrassAttack(AbstractGrassPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveLightingAttack(AbstractLightingPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receiveFightingAttack(AbstractFightingPokemon attack){
        this.receiveResistantAttack(attack);
    }
}
