package cc3002.tarea1.cards.pokemon.fire;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.water.AbstractWaterPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public abstract class AbstractFirePokemon extends AbstractPokemon {

    public AbstractFirePokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveFireAttack(this);
        }
    }

    @Override
    public void receiveWaterAttack(AbstractWaterPokemon attack){
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public abstract void accept(Visitor v);
}
