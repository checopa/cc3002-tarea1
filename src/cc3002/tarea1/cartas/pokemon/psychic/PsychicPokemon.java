package cc3002.tarea1.cartas.pokemon.psychic;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.Attack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.fighting.FightingPokemon;

import java.util.List;

public class PsychicPokemon extends AbstractPokemon {
    public PsychicPokemon(int id, int hp, List<Attack> attackList) {
        super(id, hp, attackList);
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
