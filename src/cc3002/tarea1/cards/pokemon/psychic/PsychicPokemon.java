package cc3002.tarea1.cards.pokemon.psychic;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.fighting.FightingPokemon;

import java.util.List;

public class PsychicPokemon extends AbstractPokemon {

    public PsychicPokemon(String name, int id, int hp, List<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receivePsychicAttack(this);
        }
    }

    @Override
    public void receiveFightingAttack(FightingPokemon attack) {
        this.receiveResistanAttack(attack);
    }

    @Override
    public void receivePsychicAttack(PsychicPokemon attack) {
        this.receiveWeaknessAttack(attack);
    }
}
