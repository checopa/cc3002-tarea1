package cc3002.tarea1.cartas.pokemon.lighting;

import cc3002.tarea1.cartas.pokemon.AbstractPokemon;
import cc3002.tarea1.cartas.pokemon.Attack;
import cc3002.tarea1.cartas.pokemon.IPokemon;
import cc3002.tarea1.cartas.pokemon.fighting.FightingPokemon;

import java.util.List;

public class LightingPokemon extends AbstractPokemon {
    public LightingPokemon(String name, int hp, List<Attack> attackList) {
        super(name, hp, attackList);
    }

    @Override
    public void attack(IPokemon pokemon) {
        if(this.cantAttack()) {
            pokemon.receiveLightingAttack(this);
        }
    }

    @Override
    public void receiveFightingAttack(FightingPokemon attack) {
        this.receiveWeaknessAttack(attack);
    }
}
