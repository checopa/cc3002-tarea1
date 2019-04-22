package cc3002.tarea1.cartas.pokemon.fighting;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.Attack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.grass.GrassPokemon;
import cc3002.tarea1.cartas.pokemon.psychic.PsychicPokemon;

import java.util.List;

public class FightingPokemon extends AbstractPokemon {
    public FightingPokemon(int id, int hp, List<Attack> attackList) {
        super(id, hp, attackList);
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
