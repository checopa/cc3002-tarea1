package cc3002.tarea1.cards.pokemon.grass;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fire.AbstractFirePokemon;
import cc3002.tarea1.cards.pokemon.water.AbstractWaterPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public abstract class AbstractGrassPokemon extends AbstractPokemon {

    public AbstractGrassPokemon(String name, int id, int hp, ArrayList<IAbility> abilitiesList) {
        super(name, id, hp, abilitiesList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if (this.cantAttack()) {
            pokemon.receiveGrassAttack(this);
        }
    }

    @Override
    public void receiveWaterAttack(AbstractWaterPokemon attack) {
        this.receiveResistantAttack(attack);
    }

    @Override
    public void receiveFireAttack(AbstractFirePokemon attack) {
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public abstract void accept(Visitor v);
}
