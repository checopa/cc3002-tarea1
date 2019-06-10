package cc3002.tarea1.cards.pokemon.psychic;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.AbstractFightingPokemon;
import cc3002.tarea1.habilities.Attack;

import java.util.ArrayList;

/**
 * @author José Pacheco
 */

public class AbstractPsychicPokemon extends AbstractPokemon {

    public AbstractPsychicPokemon(String name, int id, int hp, ArrayList<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receivePsychicAttack(this);
        }
    }

    @Override
    public void receiveFightingAttack(AbstractFightingPokemon attack) {
        this.receiveResistanAttack(attack);
    }

    @Override
    public void receivePsychicAttack(AbstractPsychicPokemon attack) {
        this.receiveWeaknessAttack(attack);
    }
}
