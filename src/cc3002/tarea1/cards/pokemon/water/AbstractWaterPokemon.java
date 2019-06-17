package cc3002.tarea1.cards.pokemon.water;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.AbstractFightingPokemon;
import cc3002.tarea1.cards.pokemon.grass.AbstractGrassPokemon;
import cc3002.tarea1.cards.pokemon.lighting.AbstractLightingPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public abstract class AbstractWaterPokemon extends AbstractPokemon {

    public AbstractWaterPokemon(String name, int id, int hp, ArrayList<IAbility> abilitiesList) {
        super(name, id, hp, abilitiesList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        pokemon.receiveWaterAttack(this);
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

    @Override
    public abstract void accept(Visitor v);
}
