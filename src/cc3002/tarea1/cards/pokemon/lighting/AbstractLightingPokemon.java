package cc3002.tarea1.cards.pokemon.lighting;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.AbstractFightingPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.habilities.IAbility;
import cc3002.tarea1.visitor.Visitor;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public abstract class AbstractLightingPokemon extends AbstractPokemon {

    public AbstractLightingPokemon(String name, int id, int hp, ArrayList<IAbility> abilitiesList) {
        super(name, id, hp, abilitiesList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveLightingAttack(this);
        }
    }

    @Override
    public void receiveFightingAttack(AbstractFightingPokemon attack) {
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public abstract void accept(Visitor v);
}
