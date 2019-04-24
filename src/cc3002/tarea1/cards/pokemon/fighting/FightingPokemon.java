package cc3002.tarea1.cards.pokemon.fighting;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.psychic.PsychicPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.cards.pokemon.IPokemon;
import cc3002.tarea1.cards.pokemon.grass.GrassPokemon;

import java.util.List;

public class FightingPokemon extends AbstractPokemon {

    public FightingPokemon(String name, int id, int hp, List<Attack> attackList) {
        super(name, id, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveFightingAttack(this);
        }
    }

    @Override
    public void receiveGrassAttack(GrassPokemon attack) {
        this.receiveWeaknessAttack(attack);
    }

    @Override
    public void receivePsychicAttack(PsychicPokemon attack) {
        this.receiveWeaknessAttack(attack);
    }
}
