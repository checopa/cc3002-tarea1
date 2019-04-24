package cc3002.tarea1.cards.pokemon.lighting;

import cc3002.tarea1.cards.pokemon.AbstractPokemon;
import cc3002.tarea1.cards.pokemon.fighting.FightingPokemon;
import cc3002.tarea1.habilities.Attack;
import cc3002.tarea1.cards.pokemon.IPokemon;

import java.util.List;

public class LightingPokemon extends AbstractPokemon {

    public LightingPokemon(String name, int id, int hp, List<Attack> attackList) {
        super(name, id, hp, attackList);
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
